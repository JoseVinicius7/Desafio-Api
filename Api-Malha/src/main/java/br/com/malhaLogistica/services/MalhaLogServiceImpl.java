package br.com.malhaLogistica.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.malhaLogistica.controller.form.AtualizacaoForm;
import br.com.malhaLogistica.controller.form.MalhaLogForm;
import br.com.malhaLogistica.exception.MalhaLogNotFoundException;
import br.com.malhaLogistica.models.MalhaLogistica;
import br.com.malhaLogistica.repository.MalhalogRepository;

@Service
public class MalhaLogServiceImpl implements MalhaLogService {

	@Autowired
	private MalhalogRepository malhaLogRepository;

	@Override
	public MalhaLogistica save(MalhaLogForm form) {
		MalhaLogistica malha = form.converter();

		return malhaLogRepository.save(malha);
	}

	@Override
	public List<MalhaLogistica> findAll() {
		return malhaLogRepository.findAll();
	}

	@Override
	public Optional<MalhaLogistica> findById(long id) {
		return malhaLogRepository.findById(id);
	}

	@Override
	public MalhaLogistica update(long id, AtualizacaoForm form) {
		Optional<MalhaLogistica> optional = malhaLogRepository.findById(id);
		if (!optional.isPresent()) {
			throw new MalhaLogNotFoundException("Malha de id: " + id + " não encontrado");
		}

		MalhaLogistica malha = form.atualizar(id, malhaLogRepository);
		return malha;
	}

	@Override
	public void delete(long id) {
		Optional<MalhaLogistica> optional = malhaLogRepository.findById(id);
		if (!optional.isPresent()) {
			throw new MalhaLogNotFoundException("Malha de id " + id + " não encontrado");
		}
		malhaLogRepository.deleteById(id);
	}

}
