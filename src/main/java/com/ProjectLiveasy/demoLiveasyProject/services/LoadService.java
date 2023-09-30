package com.ProjectLiveasy.demoLiveasyProject.services;

import com.ProjectLiveasy.demoLiveasyProject.dataModel.LoadModel;
import com.ProjectLiveasy.demoLiveasyProject.model.PayLoads;
import com.ProjectLiveasy.demoLiveasyProject.repository.LoadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoadService {

    private LoadReposi
    tory loadRepository;

    @Autowired
    public LoadService(LoadRepository loadRepository) {
        this.loadRepository = loadRepository;
    }

    public LoadModel createLoadModel(PayLoads payLoads) {

        LoadModel loadModel = new LoadModel();
        loadModel.setLoadingPoint(payLoads.getLoadingPoint());
        loadModel.setComment(payLoads.getComment());

        loadRepository.save(loadModel);
        return loadModel;
    }
}
