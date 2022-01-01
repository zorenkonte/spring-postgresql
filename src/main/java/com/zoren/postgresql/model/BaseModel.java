package com.zoren.postgresql.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseModel {
    public static final long serialVersionUID = 46L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
