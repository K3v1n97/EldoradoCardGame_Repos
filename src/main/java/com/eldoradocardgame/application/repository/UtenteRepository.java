package com.eldoradocardgame.application.repository;

import com.eldoradocardgame.application.model.user.Utente;
import org.springframework.data.repository.CrudRepository;

public interface UtenteRepository extends CrudRepository<Utente, String> {

}
