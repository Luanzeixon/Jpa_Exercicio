package br.edu.ifrn.jpa.dominio;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos;
}
