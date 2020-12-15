package com.example.demo.service;


import com.example.demo.entity.Trainings;
import com.example.demo.mapper.TrainMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {
    @Autowired
    TrainMapper trainMapper;
    public Trainings getTraining(String trainingName){
        return trainMapper.getTraining(trainingName);
    }

}
