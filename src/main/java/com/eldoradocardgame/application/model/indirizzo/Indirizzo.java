package com.eldoradocardgame.application.model.indirizzo;

import lombok.Data;

import javax.lang.model.element.Name;
import javax.persistence.*;

@Data
@Entity
public class Indirizzo {

    @Id
    @Column(name = "USER_ADDRESS_ID")
    @JoinColumn(name = "USER_ID")
    private String idUser;
    @Column(name = "ADDRESS_NATION")
    @OneToOne
    @JoinColumn(name = "NATION_ID")
    private Nazione nation;
    @Column(name = "STREET")
    private String street;
    @Column(name = "HOUSE_NUMBER")
    private int houseNumber;

}
