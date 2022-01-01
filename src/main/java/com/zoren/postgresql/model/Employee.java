package com.zoren.postgresql.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table
@Entity
public class Employee extends BaseModel {
    private String name;
    private String gender;
    private String address;
    private Date dob;
}
