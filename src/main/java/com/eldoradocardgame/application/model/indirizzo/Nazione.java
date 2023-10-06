package com.eldoradocardgame.application.model.indirizzo;

import lombok.Data;

import javax.persistence.*;
import java.io.File;
import java.util.List;

@Data
@Entity
public class Nazione {

    @Id
    @GeneratedValue
    @Column(name = "NATION_ID")
    private Long nationId;
    @Column(name = "NATION_NAME")
    private String name;
    @Column(name = "NATION_FLAG")
    private File flag;
    @OneToMany
    @JoinColumn(name = "REGION_ID")
    @Column(name = "NATION_REGION")
    private List<Regione> region;

}
