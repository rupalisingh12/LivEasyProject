package com.ProjectLiveasy.demoLiveasyProject.controller;

import com.ProjectLiveasy.demoLiveasyProject.model.CreateLoadResponse;
import com.ProjectLiveasy.demoLiveasyProject.model.PayLoads;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("LoadAPI")
public class LoadAPIs {
    int loadId=0;

    ArrayList<PayLoads> list1 = new ArrayList<>();

    @PutMapping
    public PayLoads updateLoadID(@RequestBody String shipperID){
        String input=shipperID;
        for(int i=0;i<list1.size();i++){
            PayLoads reqPayLoad=list1.get(i);
            if(reqPayLoad.getShipperID().equals(input)){
                reqPayLoad.setShipperID(shipperID);
                return reqPayLoad;

            }
        }
        return null;


    }
    @PostMapping
    public PayLoads createNewLoadId(){
        loadId=loadId+1;
        PayLoads Pans=new PayLoads("a","b","c","d",0,12,"g","h",loadId);
        return Pans;
    }
    @GetMapping
    public PayLoads getPayLoad(String shipperID){
        String input1=shipperID;
        for(int i=0;i<list1.size();i++){
            PayLoads p1=list1.get(i);
            if(p1.getShipperID().equals(input1)){
                return p1;
            }
        }
        return null;

    }
    public void deletePayLoads(String shipperID){
        String input2=shipperID;
        for(int i=0;i<list1.size();i++){
            PayLoads p1=list1.get(i);
            if(p1.getShipperID().equals(input2)){
                list1.remove(p1);
                break;
            }
        }


    }


}
