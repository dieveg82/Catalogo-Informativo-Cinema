package it.epicode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.epicode.service.ArtistaService;

@RestController
@RequestMapping ("/artista")
public class ArtistaController {

	@Autowired 
	ArtistaService artistaSerivce;
	
	
	
}
