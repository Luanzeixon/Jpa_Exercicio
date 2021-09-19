package br.edu.ifrn.jpa.dominio;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Livro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToMany
	@JoinTable(name = "Liv_Aut", joinColumns = @JoinColumn(name = "Liv_Id"), 
		inverseJoinColumns = @JoinColumn(name = "Aut_Id"))
	private Collection<Autor> autores;
}
