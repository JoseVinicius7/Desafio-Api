package br.com.malhaLogistica.services;

import java.util.List;
import java.util.Optional;

import br.com.malhaLogistica.controller.form.AtualizacaoForm;
import br.com.malhaLogistica.controller.form.MalhaLogForm;
import br.com.malhaLogistica.models.MalhaLogistica;

public interface MalhaLogService {

	MalhaLogistica save(MalhaLogForm form);

	List<MalhaLogistica> findAll();

	Optional<MalhaLogistica> findById(long id);
	
	void delete(long id);

	MalhaLogistica update(long id, AtualizacaoForm form);

}
