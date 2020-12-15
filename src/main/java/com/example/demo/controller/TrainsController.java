package com.example.demo.controller;


import com.example.demo.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/train")
public class TrainsController {
    @Autowired
    private TrainService trainService;

    @RequestMapping("getTraining/{trainingName}")
        public String GetTraining(@PathVariable String trainingName){
        return trainService.getTraining(trainingName).toString();
    }
}
