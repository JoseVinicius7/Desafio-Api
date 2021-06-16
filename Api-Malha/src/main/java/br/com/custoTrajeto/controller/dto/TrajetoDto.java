package br.com.custoTrajeto.controller.dto;

import com.sun.istack.NotNull;

import br.com.custoTrajeto.models.Trajeto;

public class TrajetoDto {

	@NotNull
	private String autonomia;
	@NotNull
	private double valorDoLitro;
	
	
	

	public TrajetoDto(Trajeto trajeto ) {
		this.autonomia = trajeto.getAutonomia();
		this.valorDoLitro = trajeto.getValorDoLitro();
	}

	public String getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(String autonomia) {
		this.autonomia = autonomia;
	}

	public double getValorDoLitro() {
		return valorDoLitro;
	}

	public void setValorDoLitro(double valorDoLitro) {
		this.valorDoLitro = valorDoLitro;
	}

}
