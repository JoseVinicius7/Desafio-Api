package br.com.custoTrajeto.service;

import java.util.List;

import br.com.custoTrajeto.controller.form.TrajetoForm;
import br.com.custoTrajeto.models.Trajeto;

public interface CustoTrajetoService {
	
	Trajeto save(TrajetoForm form);

	List<Trajeto> findAll();


}
