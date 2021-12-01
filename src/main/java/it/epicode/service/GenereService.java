package it.epicode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.model.Genere;
import it.epicode.persistence.GenereRepository;

@Service
public class GenereService {

	@Autowired
	GenereRepository genereRepository;
	
	public Genere getBy (Long id) {
		return genereRepository.getById(id);
	}
	
	public List<Genere> findAll (){
		return genereRepository.findAll();
	}
	
	public void creazione (Genere genere) {
		genereRepository.save(genere);	
	}
	
	public void eliminazione (Genere genere) {
		genereRepository.delete(genere);	
	}
	
	public void update (Genere genere) {
		genereRepository.save(genere);	
	}
}
