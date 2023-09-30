package com.ProjectLiveasy.demoLiveasyProject.repository;

import com.ProjectLiveasy.demoLiveasyProject.dataModel.LoadModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LoadRepository extends JpaRepository<LoadModel, Integer> {

    List<LoadModel> getByShipperID(String shipperID);

    LoadModel getByLoadId(Integer loadId);
}
