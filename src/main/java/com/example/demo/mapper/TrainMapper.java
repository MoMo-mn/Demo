package com.example.demo.mapper;

import com.example.demo.entity.Trainings;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainMapper {
   Trainings getTraining(String uid,String trainingName);
   List<Trainings> getTrainingAll(String uid);
   List<Trainings> getTrainingFlag(String uid);
   List<Trainings> getTrainingPropose(String uid);
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
