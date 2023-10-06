package com.eldoradocardgame.application.model.indirizzo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Regione {

    @Id
    @GeneratedValue
    @Column(name = "REGION_ID")
    private Long regionId;
    @Column(name = "REGION_NAME")
    private String name;
    @Column(name = "REGION_PROVINCE_ID")
    @OneToMany
    @JoinColumn(name = "PROVINCE_ID")
    private List<Provincia> provinces;

}
