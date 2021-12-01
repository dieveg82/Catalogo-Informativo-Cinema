package it.epicode.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Film {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	private String titolo;
	private Integer anno;
	private ArrayList<String> lingue = new ArrayList();
	@OneToOne
	private Stato paeseDiProduzione = new Stato ();
	@ManyToOne
	private Genere relazione = new Genere();
	@OneToOne
	private Artista regista = new Artista ();
	
}
