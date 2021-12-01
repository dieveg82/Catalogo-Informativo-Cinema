package it.epicode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.model.Artista;
import it.epicode.persistence.ArtistaRepository;

@Service
public class ArtistaService {

	@Autowired
	ArtistaRepository artistaRepository;
	
	public Artista getBy (Long id) {
		return artistaRepository.getById(id);
	}
	
	public List<Artista> findAll (){
		return artistaRepository.findAll();
	}
	
	public void creazione (Artista artista) {
		artistaRepository.save(artista);	
	}
	
	public void eliminazione (Artista artista) {
		artistaRepository.delete(artista);	
	}
	
	public void update (Artista artista) {
		artistaRepository.save(artista);	
	}
}
