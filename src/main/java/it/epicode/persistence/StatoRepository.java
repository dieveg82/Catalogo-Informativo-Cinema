package it.epicode.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.model.Stato;

@Repository
public interface StatoRepository extends JpaRepository<Stato, Long> {

}
