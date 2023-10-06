package com.eldoradocardgame.application.model.user;

import com.eldoradocardgame.application.model.indirizzo.Indirizzo;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "USER")
public class Utente implements Serializable {
    @Id
    @Column(name = "USER_ID")
    private String userId;
    private String email;
    private String password;
    @Column(name = "USER_NAME", nullable = false)
    private String username;
    @Column(name = "FIRST_NAME", nullable = false)
    private String firstName;
    @Column(name = "LAST_NAME", nullable = false)
    private String lastName;
    @Column(name = "DATE_OF_BIRTH")
    private Date birthDate;
    @Column(name = "USER_TYPE", nullable = false)
    private int userType;
    @Column(name = "ADDRESS")
    @OneToOne
    @JoinColumn(name = "USER_ADDRESS_ID", nullable = false)
    private Indirizzo address;
    @Column(name = "TELEPHONE_NUMBER")
    private Long telephone;

}
