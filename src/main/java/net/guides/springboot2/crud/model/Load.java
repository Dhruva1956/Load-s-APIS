package net.guides.springboot2.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "load")
public class Load {

    private long shipperId;
    private String loadingPoint;
    private String unloadingPoint;
    private String productType;
    private String truckType;
    private String noOfTrucks;
    private String weight;
    private String comment;

    public Load() {

    }


    public Load(
                String loadingPoint,
                String unloadingPoint,
                String productType,
                String truckType,
                String noOfTrucks,
                String weight,
                String comment) {
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment=comment;
    }
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        public long getShipperId() {
        return shipperId;
    }
    public void setShipperId(long shipperId) {
        this.shipperId = shipperId;
    }
 
    @Column(name = "loadingPoint", nullable = false)
    public String getLoadingPoint() {
        return loadingPoint;
    }
    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }
 
    @Column(name = "unloadingPoint", nullable = false)
    public String getUnloadingPoint() {
        return unloadingPoint;
    }
    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }
 
    @Column(name = "productType", nullable = false)
    public String getProductType() {
        return productType;
    }
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @Column(name = "truckType", nullable = false)
    public String getTruckType() {
        return truckType;
    }
    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    @Column(name = "noOfTrucks", nullable = false)
    public String getNoOfTrucks() {
        return noOfTrucks;
    }
    public void setNoOfTrucks(String noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    @Column(name = "weight", nullable = false)
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }

    @Column(name = "comment", nullable = false)
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "payload: [shipperId=" + shipperId + ", loadingPoint=" + loadingPoint + ", unloadingPoint=" + unloadingPoint + ", productType=" + productType
       + ", truckType=" + truckType + ", noOfTrucks=" + noOfTrucks + ", weight=" + weight + ", optional:comment=" + comment + "]";
    }

}