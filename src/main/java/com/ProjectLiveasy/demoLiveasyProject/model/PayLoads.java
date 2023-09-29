package com.ProjectLiveasy.demoLiveasyProject.model;

public class PayLoads {
    String loadingPoint;
    String unloadingPoint;
    String productType;
    String truckType;
    int noOfTrucks;
    int weight;
    String comment;
    String shipperID;
    String date;
    int loadId;

    public PayLoads(String loadingPoint, String unloadingPoint, String productType, String truckType, int noOfTrucks, int weight, String comment, String shipperID, String date, int loadId) {
        this.loadingPoint = loadingPoint;
        this.unloadingPoint = unloadingPoint;
        this.productType = productType;
        this.truckType = truckType;
        this.noOfTrucks = noOfTrucks;
        this.weight = weight;
        this.comment = comment;
        this.shipperID = shipperID;
        this.date = date;
        this.loadId = loadId;
    }



    public int getLoadId() {
        return loadId;
    }

    public void setLoadId(int loadId) {
        this.loadId = loadId;
    }

    



    public PayLoads(String aNull, String s, String string, String aNull1, int i, int i1, String s1, String string1,int loadId) {
    }

    public String getLoadingPoint() {
        return loadingPoint;
    }

    public void setLoadingPoint(String loadingPoint) {
        this.loadingPoint = loadingPoint;
    }

    public String getUnloadingPoint() {
        return unloadingPoint;
    }

    public void setUnloadingPoint(String unloadingPoint) {
        this.unloadingPoint = unloadingPoint;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getTruckType() {
        return truckType;
    }

    public void setTruckType(String truckType) {
        this.truckType = truckType;
    }

    public int getNoOfTrucks() {
        return noOfTrucks;
    }

    public void setNoOfTrucks(int noOfTrucks) {
        this.noOfTrucks = noOfTrucks;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShipperID() {
        return shipperID;
    }

    public void setShipperID(String shipperID) {
        this.shipperID = shipperID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
