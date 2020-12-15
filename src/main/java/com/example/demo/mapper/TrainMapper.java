package com.example.demo.mapper;

import com.example.demo.entity.Trainings;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainMapper {
    Trainings getTraining(String trainingName);
}
