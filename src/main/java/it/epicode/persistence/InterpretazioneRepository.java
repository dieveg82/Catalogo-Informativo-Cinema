package it.epicode.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.model.Interpretazione;

@Repository
public interface InterpretazioneRepository extends JpaRepository<Interpretazione, Long> {

}
