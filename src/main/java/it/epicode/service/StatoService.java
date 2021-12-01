package it.epicode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.model.Stato;
import it.epicode.persistence.StatoRepository;

@Service
public class StatoService {

	@Autowired
	StatoRepository statoRepository;
	
	public  Stato getBy (Long id) {
		return statoRepository.getById(id);
	}
	
	public List<Stato> findAll (){
		return statoRepository.findAll();
	}
	
	public void creazione (Stato stato) {
		statoRepository.save(stato);	
	}
	
	public void eliminazione (Stato stato) {
		statoRepository.delete(stato);	
	}
	
	public void update (Stato stato) {
		statoRepository.save(stato);	
	}
}
