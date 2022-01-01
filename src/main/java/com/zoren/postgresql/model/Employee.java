package com.zoren.postgresql.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Getter
@Setter
@Table
@Entity
@RequiredArgsConstructor
public class Employee extends BaseModel {

    private String name;
    private String gender;
    private String address;
    private Date dob;

}
