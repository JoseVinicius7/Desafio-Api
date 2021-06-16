package br.com.custoTrajeto.controller.form;

import java.util.List;
import java.util.stream.Collectors;

import com.sun.istack.NotNull;

import br.com.custoTrajeto.controller.dto.TrajetoDto;
import br.com.custoTrajeto.models.Trajeto;

public class TrajetoForm {

	@NotNull
	private String autonomia;

	@NotNull
	private double valorDoLitro;
	

	public TrajetoForm(String autonomia, double valorDoLitro) {
		this.autonomia = autonomia;
		this.valorDoLitro = valorDoLitro;
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
	
	public static List<TrajetoDto> converter(List<Trajeto>trajeto) {
		return trajeto.stream().map(TrajetoDto::new).collect(Collectors.toList());
	}

	public Trajeto converter() {			
		return new Trajeto(autonomia, valorDoLitro);
		}
	
}
