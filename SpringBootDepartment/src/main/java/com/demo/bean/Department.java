package com.demo.bean;

public class Department {
    private int dId;
    private String dName;
    private String dHead;
    public int getdId() {
        return dId;
    }
    public void setdId(int dId) {
        this.dId = dId;
    }
    public String getdName() {
        return dName;
    }
    public void setdName(String dName) {
        this.dName = dName;
    }
    public String getdHead() {
        return dHead;
    }
    public void setdHead(String dHead) {
        this.dHead = dHead;
    }
    public Department(int dId, String dName, String dHead) {
        super();
        this.dId = dId;
        this.dName = dName;
        this.dHead = dHead;
    }
    public Department() {
        super();
    }
    @Override
    public String toString() {
        return "Department [dId=" + dId + ", dName=" + dName + ", dHead=" + dHead + "]";
    }



}