package com.cognizant.orm_learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="country")
public class Country {
    @Id
    @Column(name="co_code")
    private String co_code;

    @Column(name="co_name")
    private String co_name;

    private String getCo_code(){
        return co_code;
    }
    private String getCo_name(){
        return co_name;
    }

    private void setCo_code(String co_code){
        this.co_code=co_code;
    }

    private void setCo_name(String co_name){
        this.co_name=co_name;
    }

    @Override
    public String toString() {
        return "Country [code=" + co_code + ", name=" + co_name + "]";
    }
}
