package br.com.produtos.apirest.controller.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.sun.istack.NotNull;

import br.com.produtos.apirest.models.MalhaLogistica;

public class MalhaLogDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@NotNull
	private String origem;
	@NotNull
	private String destino;
	@NotNull
	private double distancia;

	public MalhaLogDto(MalhaLogistica malha) {

		
		this.origem = malha.getOrigem();
		this.destino = malha.getDestino();
		this.distancia = malha.getDistancia();

	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
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
