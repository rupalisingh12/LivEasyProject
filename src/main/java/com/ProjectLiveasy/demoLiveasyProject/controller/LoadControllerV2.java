package com.ProjectLiveasy.demoLiveasyProject.controller;

import com.ProjectLiveasy.demoLiveasyProject.dataModel.LoadModel;
import com.ProjectLiveasy.demoLiveasyProject.model.PayLoads;
import com.ProjectLiveasy.demoLiveasyProject.model.listOfShipperID;
import com.ProjectLiveasy.demoLiveasyProject.services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("v2/load")
public class LoadControllerV2 {

    private LoadService loadService;

    @Autowired
    public LoadControllerV2(LoadService loadService) {

        this.loadService = loadService;
    }


    @PostMapping
    public PayLoads createNewLoadId(@RequestBody PayLoads payLoads) {
        LoadModel response = loadService.createLoadModel(payLoads);
        payLoads.setLoadId(response.getLoadId());
        return payLoads;
    }

    @GetMapping()
    public listOfShipperID getPayLoad(@RequestParam String shipperID) {
        List<LoadModel> loadModelList = loadService.getLoadModelByShipmentId(shipperID);
        listOfShipperID response = new listOfShipperID();
        response.setLoadModels(loadModelList);
        return response;
    }

    @DeleteMapping("/{loadId}")
    public void deleteLoad(@PathVariable Integer loadId) throws Exception {
        loadService.deleteLoad(loadId);

    }

    @GetMapping("/{loadId}")
    public LoadModel getLoadIddetails(@PathVariable Integer loadId) throws Exception {
        return loadService.getLoadModelByLoadId(loadId);

    }

    @PutMapping
    public LoadModel updateLoadID(@RequestBody PayLoads request) throws Exception {
        return loadService.update(request);
    }
}
