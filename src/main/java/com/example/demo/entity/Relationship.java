package com.example.demo.entity;

public class Relationship {
    private String uid;
    private String trainingId;
    private boolean propose;
    private boolean flag;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getTrainingId() {
        return trainingId;
    }

    public void setTrainingId(String trainingId) {
        this.trainingId = trainingId;
    }

    public boolean getPropose() {
        return propose;
    }

    public void setPropose(boolean propose) {
        this.propose = propose;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "relationship{" +
                "uid='" + uid + '\'' +
                ", trainingId='" + trainingId + '\'' +
                ", propose=" + propose +
                ", flag=" + flag +
                '}';
    }
}
