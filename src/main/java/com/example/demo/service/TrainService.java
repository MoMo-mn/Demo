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

    public List<Trainings>  getTrainingAll(String uid){
        return trainMapper.getTrainingAll(uid);
    }

    public Trainings getTraining(String uid,String trainingName){
        return trainMapper.getTraining(uid,trainingName);
    }

    public List<Trainings>  getTrainingFlag(String uid){
        return trainMapper.getTrainingFlag(uid);
    }

    public List<Trainings>  getTrainingPropose(String uid){
        return trainMapper.getTrainingPropose(uid);
    }

}
