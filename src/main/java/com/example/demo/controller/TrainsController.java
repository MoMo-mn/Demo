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
    @GetMapping(value = "getTraining/{trainingName}")
    public String GetTraining(@PathVariable String trainingName){
        return trainService.getTraining(trainingName).toString();
    }
    @ApiOperation(value="所有课程查询", notes="课程列表")
    @GetMapping(value = "getTrainingAll")
    public List<Trainings> GetTrainingAll(){
        return trainService.getTrainingAll();
    }
    @ApiOperation(value="课程查询", notes="根据课程名称")
    @GetMapping(value = "getTrainingFlag")
    public List<Trainings> GetTrainingFlag(){
        return trainService.getTrainingFlag();
    }
    @ApiOperation(value="课程查询", notes="根据课程名称")
    @GetMapping(value = "getTrainingPropose")
    public List<Trainings> GetTrainingPropose(){
        return trainService.getTrainingPropose();
    }

}
