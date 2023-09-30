package com.ProjectLiveasy.demoLiveasyProject.repository;

import com.ProjectLiveasy.demoLiveasyProject.dataModel.LoadModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoadRepository extends JpaRepository<LoadModel, Integer> {

}
