package com.keerthi.railway.model;

public class Passanger {
    
    private String name;
    private int age;
    private String gender;
    private int trainNo;

    public int getTrainNo() {
        return trainNo;
    }
    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }
    private String Status;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getStatus() {
        return Status;
    }
    public void setStatus(String status) {
        Status = status;
    }
}
