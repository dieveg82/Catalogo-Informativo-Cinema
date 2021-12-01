package it.epicode.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.epicode.model.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

}
