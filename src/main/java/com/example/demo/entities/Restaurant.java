package com.example.demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "RESTAURANTS")
public class Restaurant {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "NAME")
    private String name;
    @Column(name = "PEANUT_SCORE")
    private Float peanutScore;
    @Column(name = "EGG_SCORE")
    private Float eggScore;
    @Column(name = "DAIRY_SCORE")
    private Float dairyScore;

    @OneToOne(mappedBy = "restaurant")
    private Review review;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPeanutScore() {
        return peanutScore;
    }

    public void setPeanutScore(Float peanutScore) {
        this.peanutScore = peanutScore;
    }

    public Float getEggScore() {
        return eggScore;
    }

    public void setEggScore(Float eggScore) {
        this.eggScore = eggScore;
    }

    public Float getDairyScore() {
        return dairyScore;
    }

    public void setDairyScore(Float dairyScore) {
        this.dairyScore = dairyScore;
    }

    @JsonIgnore
    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
