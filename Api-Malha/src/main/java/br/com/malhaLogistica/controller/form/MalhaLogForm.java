package br.com.malhaLogistica.controller.form;

import java.util.List;
import java.util.stream.Collectors;

import com.sun.istack.NotNull;

import br.com.malhaLogistica.controller.dto.MalhaLogDto;
import br.com.malhaLogistica.models.MalhaLogistica;;

public class MalhaLogForm {
	
	@NotNull
	private String origem;
	@NotNull
	private String destino;
	@NotNull
	private double distancia;

	

	public String getOrigem() {
		return origem;
	}

	public String getDestino() {
		return destino;
	}

	public double getDistancia() {
		return distancia;
	}

	public static List<MalhaLogDto> converter(List<MalhaLogistica>malha) {
		return malha.stream().map(MalhaLogDto::new).collect(Collectors.toList());
	}

	public MalhaLogistica converter() {			
			return new MalhaLogistica(origem, destino, distancia);
		}

}
