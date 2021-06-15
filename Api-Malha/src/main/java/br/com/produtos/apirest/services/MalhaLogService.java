package br.com.produtos.apirest.services;

import java.util.List;
import java.util.Optional;

import br.com.produtos.apirest.controller.form.AtualizacaoForm;
import br.com.produtos.apirest.controller.form.MalhaLogForm;
import br.com.produtos.apirest.models.MalhaLogistica;

public interface MalhaLogService {

	MalhaLogistica save(MalhaLogForm form);

	List<MalhaLogistica> findAll();

	Optional<MalhaLogistica> findById(long id);
	
	void delete(long id);

	MalhaLogistica update(long id, AtualizacaoForm form);

}
