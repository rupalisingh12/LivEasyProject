package com.ProjectLiveasy.demoLiveasyProject.model;

import java.util.ArrayList;

public class listOfShipperID {
    ArrayList<PayLoads>listans=new ArrayList<>();
    String messgae = "";

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
