package net.guides.springboot2.crud.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.guides.springboot2.crud.exception.ResourceNotFoundException;
import net.guides.springboot2.crud.model.Load;
import net.guides.springboot2.crud.repository.LoadRepository;


@RestController
@RequestMapping("/api/v1")
public class LoadController {
    @Autowired
    private LoadRepository LoadRepository;

    @GetMapping("/load")
    public List<Load> getAllEmployees() {
        return LoadRepository.findAll();
    }

    @GetMapping("/load/{id}")
    public ResponseEntity<Load> getShipperId(@PathVariable(value = "id") Long shipperId)
            throws ResourceNotFoundException {
        Load load = LoadRepository.findById(shipperId)
                .orElseThrow(() -> new ResourceNotFoundException("Load not found for this shipper Id :: " + shipperId));
        return ResponseEntity.ok().body(load);
    }

    @PostMapping("/load")
    public Load createLoad(@Valid @RequestBody Load load) {
        return LoadRepository.save(load);
    }

    @PutMapping("/load/{id}")
    public ResponseEntity<Load> updateLoad(@PathVariable(value = "id") Long shipperId,
                                               @Valid @RequestBody Load loadDetails) throws ResourceNotFoundException {
        Load load = LoadRepository.findById(shipperId)
                .orElseThrow(() -> new ResourceNotFoundException("Load not found for this shipper Id  :: " + shipperId));
        load.setProductType(loadDetails.getProductType());
        load.setUnloadingPoint(loadDetails.getUnloadingPoint());
        load.setLoadingPoint(loadDetails.getLoadingPoint());
        load.setTruckType(loadDetails.getTruckType());
        load.setNoOfTrucks(loadDetails.getNoOfTrucks());
        load.setWeight(loadDetails.getWeight());
        load.setComment(loadDetails.getComment());

        final Load updatedLoad = LoadRepository.save(load);
        return ResponseEntity.ok(updatedLoad);
    }

    @DeleteMapping("/load/{id}")
    public Map<String, Boolean> deleteEmployee(@PathVariable(value = "id") Long shipperId)
            throws ResourceNotFoundException {
        Load load = LoadRepository.findById(shipperId)
                .orElseThrow(() -> new ResourceNotFoundException("Load not found for this shipper Id :: " + shipperId));

        LoadRepository.delete(load);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}