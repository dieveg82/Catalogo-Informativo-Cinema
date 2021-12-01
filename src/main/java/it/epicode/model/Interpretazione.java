package it.epicode.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Interpretazione {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	private Artista attore = new Artista ();
	@OneToOne
	private Film film = new Film ();
	private String nomePersonaggio;
	
}
