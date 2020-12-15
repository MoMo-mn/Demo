package com.example.demo.entity;

import java.util.Date;

public class Trainings {
    private String trainingId;
    private String trainingName;
    private String trainerName;
    private Integer yearsOfExperence;
    private Boolean flag;
    private Integer avcRating;
    private String delivered;
    private double price;
    private Boolean propose;
    private Date datetime;

    public String getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }

    public String getTrainingName() {
        return trainingName;
    }

    public void setTrainingName(String trainingName) {
        this.trainingName = trainingName;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public Integer getYearsOfExperence() {
        return yearsOfExperence;
    }

    public void setYearsOfExperence(Integer yearsOfExperence) {
        this.yearsOfExperence = yearsOfExperence;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Integer getAvcRating() {
        return avcRating;
    }

    public void setAvcRating(Integer avcRating) {
        this.avcRating = avcRating;
    }

    public String getDelivered() {
        return delivered;
    }

    public void setDelivered(String delivered) {
        this.delivered = delivered;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Boolean getPropose() {
        return propose;
    }

    public void setPropose(Boolean propose) {
        this.propose = propose;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    @Override
    public String toString() {
        return "Trainings{" +
                "trainingId='" + trainingId + '\'' +
                ", trainingName='" + trainingName + '\'' +
                ", trainerName='" + trainerName + '\'' +
                ", yearsOfExperence=" + yearsOfExperence +
                ", flag=" + flag +
                ", avcRating=" + avcRating +
                ", delivered='" + delivered + '\'' +
                ", price=" + price +
                ", propose=" + propose +
                ", datetime=" + datetime +
                '}';
    }
}
