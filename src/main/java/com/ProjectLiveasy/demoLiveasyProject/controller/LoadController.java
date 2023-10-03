package com.ProjectLiveasy.demoLiveasyProject.controller;

import com.ProjectLiveasy.demoLiveasyProject.model.PayLoads;
import com.ProjectLiveasy.demoLiveasyProject.model.listOfShipperID;
import com.ProjectLiveasy.demoLiveasyProject.services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("load")
public class LoadController {
    int loadId=0;
    private LoadService loadService;

    @Autowired
    public LoadController(LoadService loadService) {
        this.loadService = loadService;
    }

    ArrayList<PayLoads> list1;

    public LoadController() {
        this.loadId = 0;
        this.list1 = new ArrayList<>();;
    }

    @PutMapping
    public PayLoads updateLoadID(@RequestBody PayLoads payLoads) throws Exception{
        int loadId = payLoads.getLoadId();
        PayLoads payLoad = null;
        for (PayLoads loads : list1) {
            if (loads.getLoadId() == loadId) {
                payLoad = loads;
            }
        }

        if(payLoad == null) {
            // 500
            throw new Exception("Load id not found");
        }
        if(!StringUtils.isEmpty(payLoads.getLoadingPoint())){
            payLoad.setLoadingPoint(payLoads.getLoadingPoint());
        }
        if(!StringUtils.isEmpty(payLoads.getProductType())) {
            payLoad.setProductType(payLoads.getProductType());
        }
        // TODO complete API
        return payLoad;
    }
    @PostMapping("/load")
    public PayLoads createNewLoadId(@RequestBody PayLoads payLoads){
        loadId=loadId+1;
        payLoads.setLoadId(loadId);
        list1.add(payLoads);

        return payLoads;
    }
    @GetMapping()
    public listOfShipperID getPayLoad(@RequestParam String shipperID){
       ArrayList<PayLoads>list12=new ArrayList<>();
        for (PayLoads p1 : list1) {
            if (p1.getShipperID().equals(shipperID)) {
                list12.add(p1);
            }
        }
       listOfShipperID l1 = new listOfShipperID(list12);
        l1.setListOfShipperId(list12);
        if(list12.isEmpty()) {
            l1.setMessgae("No Load present with shipment id");
        }
        return l1;


    }
    @DeleteMapping("/{loadId}")
    public void deletePayLoads(@PathVariable Integer loadId) throws Exception {

        for(int i=0;i<list1.size();i++){
            PayLoads p1=list1.get(i);
            if(p1.getLoadId() == loadId){
                list1.remove(p1);
// Add response object and success message
                return;
            }
        }
        throw new Exception("Load with id "+loadId+ " not found");

    }
    @GetMapping("/{loadId}")
    public PayLoads getLoadIddetails(@PathVariable Integer loadId) {
        int ansLoadId=loadId;
        for(int i=0;i<list1.size();i++){
            PayLoads a=list1.get(i);
            int reqLoadId=a.getLoadId();
            if(reqLoadId==loadId){
                return a;
            }
        }
        return null;

    }
}
