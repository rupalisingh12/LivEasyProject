package com.ProjectLiveasy.demoLiveasyProject.model;

import com.ProjectLiveasy.demoLiveasyProject.dataModel.LoadModel;

import java.util.ArrayList;
import java.util.List;

public class listOfShipperID {
    ArrayList<PayLoads>listans=new ArrayList<>();
    List<LoadModel> loadModels = new ArrayList<>();
    String messgae = "";

    public List<LoadModel> getLoadModels() {
        return loadModels;
    }

    public void setLoadModels(List<LoadModel> loadModels) {
        this.loadModels = loadModels;
    }


    public void setMessgae(String messgae) {
        this.messgae = messgae;
    }

    public String getMessgae() {
        return this.messgae;
    }

    public listOfShipperID(ArrayList<PayLoads> listans) {
        this.listans = listans;
    }

    public listOfShipperID() {
    }

    public ArrayList<PayLoads>getListOfShipperId(){
        return listans;
    }
    public ArrayList<PayLoads>setListOfShipperId(ArrayList<PayLoads>list){
         return this.listans=list;
    }
}
