package br.edu.ifrn.jpa.dominio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Governante {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToOne(mappedBy = "governador")
	private Estado estado;
}
