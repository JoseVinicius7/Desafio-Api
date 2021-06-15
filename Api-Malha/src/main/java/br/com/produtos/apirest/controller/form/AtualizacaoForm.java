package br.com.produtos.apirest.controller.form;

import com.sun.istack.NotNull;

import br.com.produtos.apirest.models.MalhaLogistica;
import br.com.produtos.apirest.repository.MalhalogRepository;

public class AtualizacaoForm {

	@NotNull
	private String origem;
	@NotNull
	private String destino;
	@NotNull
	private double distancia;


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


	public MalhaLogistica atualizar(long id, MalhalogRepository malhaLogRepository) {
		MalhaLogistica malha = malhaLogRepository.getOne(id);
		malha.setOrigem(this.origem);
		malha.setDestino(this.destino);
		malha.setDistancia(this.distancia);

		return malha;

	}

}
