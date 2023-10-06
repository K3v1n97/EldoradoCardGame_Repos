package com.eldoradocardgame.application.model.indirizzo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Provincia {

    @Id
    @GeneratedValue
    @Column(name = "PROVINCE_ID")
    private Long provinceId;
    @Column(name = "PROVINCE_NAME")
    private String name;
    @Column(name = "PROVINCE_ALIAS")
    private String alias;
    @OneToMany
    @JoinColumn(name = "CITY_ID")
    @Column(name = "PROVINCE_CITY_ID")
    private List<Citta> cities;

}
