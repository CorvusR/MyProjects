package com.example.myspringboot.vo;

public class CeJobVo {
    public String id;
    public String orgId;
    public String bindId;
    public String createDate;
    public String createUser;
    public String updateDate;
    public String updateUser;
    public String processDefid;
    public String isEnd;
    public String name;
    public String dept;
    public String date;
    public Integer money;
    public String apply;

    @Override
    public String toString() {
        return "CeJobVo{" +
                "id='" + id + '\'' +
                ", orgId='" + orgId + '\'' +
                ", bindId='" + bindId + '\'' +
                ", createDate='" + createDate + '\'' +
                ", createUser='" + createUser + '\'' +
                ", updateDate='" + updateDate + '\'' +
                ", updateUser='" + updateUser + '\'' +
                ", processDefid='" + processDefid + '\'' +
                ", isEnd='" + isEnd + '\'' +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", date='" + date + '\'' +
                ", money=" + money +
                ", apply='" + apply + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getBindId() {
        return bindId;
    }

    public void setBindId(String bindId) {
        this.bindId = bindId;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public String getProcessDefid() {
        return processDefid;
    }

    public void setProcessDefid(String processDefid) {
        this.processDefid = processDefid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsEnd() {
        return isEnd;
    }

    public void setIsEnd(String isEnd) {
        this.isEnd = isEnd;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public String getApply() {
        return apply;
    }

    public void setApply(String apply) {
        this.apply = apply;
    }
}
