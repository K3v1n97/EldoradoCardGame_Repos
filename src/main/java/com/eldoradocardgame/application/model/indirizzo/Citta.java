package com.eldoradocardgame.application.model.indirizzo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Citta {
    @Id
    @GeneratedValue
    @Column(name = "CITY_ID")
    private Long cityId;
    @Column(name = "CITY_NAME")
    private String name;
    @Column(name = "CAP")
    private String cap;
}
