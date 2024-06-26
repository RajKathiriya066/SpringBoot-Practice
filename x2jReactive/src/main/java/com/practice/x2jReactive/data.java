package com.practice.x2jReactive;

import java.time.LocalDateTime;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "x2j", schema = "data")
public class data {
    
    @Id
    private String SrNo;
    private String name;
    private String d;
    private LocalDateTime creatingDateTime;


    public data() {
        SrNo=UUID.randomUUID().toString();
        name="null";
        d="null";
        creatingDateTime=LocalDateTime.now();
    }
    public data(String srNo, String name, String d,LocalDateTime cOffsetDateTime) {
        SrNo = srNo;
        this.name = name;
        this.d = d;
        this.creatingDateTime=cOffsetDateTime;
    }
    public String getSrNo() {
        return SrNo;
    }
    public void setSrNo(String srNo) {
        SrNo = srNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getD() {
        return d;
    }
    public void setD(String d) {
        this.d = d;
    }
    public LocalDateTime getCreating_Date_Time() {
        return creatingDateTime;
    }
    public void setCreating_Date_Time(LocalDateTime creating_Date_Time) {
        this.creatingDateTime = creating_Date_Time;
    }
    
}
