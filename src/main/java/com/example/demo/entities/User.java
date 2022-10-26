package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "NAME")
    private String name;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "ZIPCODE")
    private Integer zipcode;

    @Column(name = "PEANUT_ALLERGY")
    private Boolean peanutAllergy;
    @Column(name = "EGG_ALLERGY")
    private Boolean eggAllergy;
    @Column(name = "DAIRY_ALLERGY")
    private Boolean dairyAllergy;

    @OneToOne(mappedBy = "user")
    private Review review;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZipcode() {
        return zipcode;
    }

    public void setZipcode(Integer zipcode) {
        this.zipcode = zipcode;
    }

    public Boolean getPeanutAllergy() {
        return peanutAllergy;
    }

    public void setPeanutAllergy(Boolean peanutAllergy) {
        this.peanutAllergy = peanutAllergy;
    }

    public Boolean getEggAllergy() {
        return eggAllergy;
    }

    public void setEggAllergy(Boolean eggAllergy) {
        this.eggAllergy = eggAllergy;
    }

    public Boolean getDairyAllergy() {
        return dairyAllergy;
    }

    public void setDairyAllergy(Boolean dairyAllergy) {
        this.dairyAllergy = dairyAllergy;
    }

    @JsonIgnore
    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
