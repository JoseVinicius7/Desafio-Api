package br.com.custoTrajeto.service;

import java.util.List;

import br.com.custoTrajeto.controller.form.TrajetoForm;
import br.com.custoTrajeto.models.Trajeto;
import br.com.custoTrajeto.repository.CustoTrajetoRepository;

public class CustoTrajetoServiceImpl implements CustoTrajetoService{
	
	private CustoTrajetoRepository custoTrajetoRepository;
	
	@Override
	public Trajeto save(TrajetoForm form) {
		Trajeto malha = form.converter();

		return custoTrajetoRepository.save(malha);
	}

	@Override
	public List<Trajeto> findAll() {
		return custoTrajetoRepository.findAll();
	}

}
