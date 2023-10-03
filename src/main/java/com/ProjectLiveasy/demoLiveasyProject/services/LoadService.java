package com.ProjectLiveasy.demoLiveasyProject.services;

import com.ProjectLiveasy.demoLiveasyProject.dataModel.LoadModel;
import com.ProjectLiveasy.demoLiveasyProject.model.PayLoads;
import com.ProjectLiveasy.demoLiveasyProject.repository.LoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class LoadService {

    private LoadRepository loadRepository;

    public LoadService(LoadRepository loadRepository) {
        this.loadRepository = loadRepository;
    }

    public LoadModel createLoadModel(PayLoads payLoads) {
        LoadModel loadModel = new LoadModel();
        loadModel.setLoadingPoint(payLoads.getLoadingPoint());
        loadModel.setComment(payLoads.getComment());
        loadModel.setWeight(Integer.parseInt(payLoads.getWeight()));
        loadModel.setTruckType(payLoads.getTruckType());
        loadModel.setUnloadingPoint(payLoads.getUnloadingPoint());
        loadModel.setDate(payLoads.getDate());
        loadModel.setNoOfTrucks(Integer.parseInt(payLoads.getNoOfTrucks()));
        loadModel.setProductType(payLoads.getProductType());
        loadModel.setShipperID(payLoads.getShipperID());
        return loadRepository.save(loadModel);
    }


    public List<LoadModel> getLoadModelByShipmentId(String shipperID) {
        return loadRepository.getByShipperID(shipperID);
    }

    public void deleteLoad(Integer loadId) throws Exception {
        LoadModel loadModel = loadRepository.getByLoadId(loadId);
        if (loadModel == null) {
            throw new Exception("Load not found with id: " + loadId);
        }
        loadRepository.delete(loadModel);
    }

    public LoadModel getLoadModelByLoadId(Integer loadId) throws Exception {
        LoadModel loadModel = loadRepository.getByLoadId(loadId);
        if (loadModel == null) {
            throw new Exception("Load not found with id: " + loadId);
        }
        return loadModel;
    }

    public LoadModel update(PayLoads request) throws Exception {
        if (request.getLoadId() == 0) {
            throw new Exception("Load id cannot be empty or 0");
        }
        LoadModel loadModel = loadRepository.getByLoadId(request.getLoadId());
        if (loadModel == null) {
            throw new Exception("Load not found with id: " + request.getLoadId());
        }
        if(!StringUtils.isEmpty(request.getLoadingPoint())){
            loadModel.setLoadingPoint(request.getLoadingPoint());
        }
        if(!StringUtils.isEmpty(request.getProductType())) {
            loadModel.setProductType(request.getProductType());
        }
        if(!StringUtils.isEmpty(request.getComment())) {
            loadModel.setComment(request.getComment());
        }
        if(!StringUtils.isEmpty(request.getDate())){
            loadModel.setDate(request.getDate());
        }
        if(!StringUtils.isEmpty(request.getNoOfTrucks())) {
            loadModel.setNoOfTrucks(Integer.parseInt(request.getNoOfTrucks()));
        }
        if(!StringUtils.isEmpty(request.getShipperID())){
            loadModel.setShipperID(request.getShipperID());
        }
        if(!StringUtils.isEmpty(request.getWeight())) {
            loadModel.setWeight(Integer.parseInt(request.getWeight()));
        }
        if(!StringUtils.isEmpty(request.getUnloadingPoint())) {
            loadModel.setUnloadingPoint(request.getUnloadingPoint());
        }
        return loadRepository.save(loadModel);
    }
}
