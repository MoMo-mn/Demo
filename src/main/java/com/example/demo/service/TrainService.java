package com.example.demo.service;

import com.example.demo.entity.Trainings;
import com.example.demo.mapper.TrainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "TrainService")
public class TrainService {
    @Autowired
    private TrainMapper trainMapper;

    public List<Trainings>  getTrainingAll(){
        return trainMapper.getTrainingAll();
    }

    public Trainings getTraining(String trainingName){
        return trainMapper.getTraining(trainingName);
    }

    public List<Trainings>  getTrainingFlag(){
        return trainMapper.getTrainingFlag();
    }

    public List<Trainings>  getTrainingPropose(){
        return trainMapper.getTrainingPropose();
    }

}
