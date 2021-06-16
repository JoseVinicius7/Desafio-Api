package br.com.custoTrajeto.models;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import br.com.malhaLogistica.models.MalhaLogistica;

@Entity
@Table(name = "TB_TRAJETO")
public class Trajeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Embedded
	private MalhaLogistica malhaLogistica;
	
	@NotNull @Column(name = "autonomia")
	private String autonomia;
	
	@NotNull @Column(name = "valor")
	private double valorDoLitro;
	
	public Trajeto() {
		
	};
	
	public Trajeto(String autonomia, double valorDoLitro) {
		this.autonomia = autonomia;
		this.valorDoLitro = valorDoLitro;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MalhaLogistica getMalhaLogistica() {
		return malhaLogistica;
	}

	public void setMalhaLogistica(MalhaLogistica malhaLogistica) {
		this.malhaLogistica = malhaLogistica;
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
