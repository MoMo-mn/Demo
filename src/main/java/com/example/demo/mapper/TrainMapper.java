package com.example.demo.mapper;

import com.example.demo.entity.Trainings;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainMapper {
   Trainings getTraining(String trainingName);
   List<Trainings> getTrainingAll();
   List<Trainings> getTrainingFlag();
   List<Trainings> getTrainingPropose();
    /*//int insert(Trainings trainings);
    //int updateById(Trainings trainings);
    int deleteById(String trainingId);
    Trainings getTrain(String trainingId);
    List<Trainings> findTraining(int start, int count);
    //List<Trainings> findTrainingOne(String trainingName);
    List<Trainings> searchTraining(Trainings trainings);
    *//*   List<Trainings> findTrainingPropose(Boolean propose);
    List<Trainings> findTrainingFlag(Boolean flag);*/
}
