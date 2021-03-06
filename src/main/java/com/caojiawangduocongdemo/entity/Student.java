package com.caojiawangduocongdemo.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private static final long serialVersionUID = -8641291172933911171L;
    private String sysid;

    private String studentid;

    private String studentname;

    private Integer result;

    private String sclass;

    private String teacherid;

    private String stuStatus;

    private String stupic;

    public String getSysid() {
        return sysid;
    }

    public void setSysid(String sysid) {
        this.sysid = sysid == null ? null : sysid.trim();
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String studentid) {
        this.studentid = studentid == null ? null : studentid.trim();
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname == null ? null : studentname.trim();
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass == null ? null : sclass.trim();
    }

    public String getTeacherid() {
        return teacherid;
    }

    public void setTeacherid(String teacherid) {
        this.teacherid = teacherid == null ? null : teacherid.trim();
    }

    public String getStuStatus() {
        return stuStatus;
    }

    public void setStuStatus(String stuStatus) {
        this.stuStatus = stuStatus == null ? null : stuStatus.trim();
    }

    public String getStupic() {
        return stupic;
    }

    public void setStupic(String stupic) {
        this.stupic = stupic == null ? null : stupic.trim();
    }

}