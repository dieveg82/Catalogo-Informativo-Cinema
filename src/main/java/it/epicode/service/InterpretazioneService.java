package it.epicode.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.epicode.model.Interpretazione;
import it.epicode.persistence.InterpretazioneRepository;

@Service
public class InterpretazioneService {

	@Autowired
	InterpretazioneRepository interpretazioneRepository;
	
	public  Interpretazione getBy (Long id) {
		return interpretazioneRepository.getById(id);
	}
	
	public List<Interpretazione> findAll (){
		return interpretazioneRepository.findAll();
	}
	
	public void creazione (Interpretazione interpretazione) {
		interpretazioneRepository.save(interpretazione);	
	}
	
	public void eliminazione (Interpretazione interpretazione) {
		interpretazioneRepository.delete(interpretazione);	
	}
	
	public void update (Interpretazione interpretazione) {
		interpretazioneRepository.save(interpretazione);	
	}
}
