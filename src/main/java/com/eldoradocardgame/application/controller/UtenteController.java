package com.eldoradocardgame.application.controller;

import com.eldoradocardgame.application.model.user.Utente;
import com.eldoradocardgame.application.repository.UtenteRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.PreUpdate;

@RestController
@RequestMapping("/utente")
public class UtenteController {

    private UtenteRepository utenteRepository;

    @PostMapping("/addNewUser")
    public Utente addNewUtente(@RequestParam Utente utente) {
        return utenteRepository.save(utente);
    };

}
