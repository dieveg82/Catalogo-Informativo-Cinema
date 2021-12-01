package it.epicode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import it.epicode.model.Film;
import it.epicode.persistence.FilmRepository;

@Service
public class FilmService {

	@Autowired
	FilmRepository filmRepository;
	
	public Film getBy (Long id) {
		return filmRepository.getById(id);
	}
	
	public List<Film> findAll (){
		return filmRepository.findAll();
	}
	
	public void creazione (Film film) {
		filmRepository.save(film);	
	}
	
	public void eliminazione (Film film) {
		filmRepository.delete(film);	
	}
	
	public void update (Film film) {
		filmRepository.save(film);	
	}
}
