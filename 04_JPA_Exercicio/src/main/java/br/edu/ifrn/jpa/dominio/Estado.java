package br.edu.ifrn.jpa.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Estado {

	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne
	private Governante governador;
	
}
