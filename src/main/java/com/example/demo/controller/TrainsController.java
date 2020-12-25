package com.example.demo.controller;


import com.example.demo.entity.*;
import com.example.demo.service.TrainService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;


import java.security.Timestamp;
import java.util.Date;
import java.util.List;

@RestController
@Api(value = "/train", tags ="train API")
@RequestMapping("/train")
public class TrainsController {

    @Autowired
    private TrainService trainService;

    @ApiOperation(value="课程查询", notes="根据课程名称")
    @GetMapping(value = "getTraining/{uid}/{trainingName}")
    public Trainings GetTraining(@PathVariable String uid,@PathVariable String trainingName){
        return trainService.getTraining(uid,trainingName);
    }
    @ApiOperation(value="所有课程查询", notes="Search Trainings")
    @GetMapping(value = "getTrainingAll/{uid}")
    public List<Trainings> GetTrainingAll(@PathVariable String uid){
        return trainService.getTrainingAll(uid);
    }
    @ApiOperation(value="课程查询", notes="Completed Trainings")
    @GetMapping(value = "getTrainingFlag/{uid}")
    public List<Trainings> GetTrainingFlag(@PathVariable String uid){
        return trainService.getTrainingFlag(uid);
    }
    @ApiOperation(value="课程查询", notes="Current Trainings")
    @GetMapping(value = "getTrainingPropose/{uid}")
    public List<Trainings> GetTrainingPropose(@PathVariable String uid){
        return trainService.getTrainingPropose(uid);
    }

}
