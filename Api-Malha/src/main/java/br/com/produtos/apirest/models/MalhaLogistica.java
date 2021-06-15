package br.com.produtos.apirest.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "TB_MALHA")

public class MalhaLogistica implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull @Column(name = "origem")
	private String origem;
	@NotNull @Column(name = "destino")
	private String destino;
	@NotNull @Column(name = "distancia")
	private double distancia;
	
	public MalhaLogistica() {
		
	}

	public MalhaLogistica(String origem, String destino, double distancia) {
		this.origem = origem;
		this.destino = destino;
		this.distancia = distancia;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}

}
