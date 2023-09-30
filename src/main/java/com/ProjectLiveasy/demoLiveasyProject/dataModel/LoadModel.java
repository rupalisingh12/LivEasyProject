package com.ProjectLiveasy.demoLiveasyProject.dataModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="Load")
@AllArgsConstructor
@Data
@NoArgsConstructor
public class LoadModel {

    public String loadingPoint;
    public String unloadingPoint;
    public String productType;
    public String truckType;
    public int noOfTrucks;
    public int weight;
    public String comment;
    public String shipperID;
    public String date;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int loadId;
}
