package br.com.malhaLogistica.controller;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.malhaLogistica.controller.dto.MalhaLogDto;
import br.com.malhaLogistica.controller.form.AtualizacaoForm;
import br.com.malhaLogistica.controller.form.MalhaLogForm;
import br.com.malhaLogistica.models.MalhaLogistica;
import br.com.malhaLogistica.services.MalhaLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/malhas")
@Api(value = "API Rest Malhas Logisticas")
@CrossOrigin (origins = "*")

public class MalhaLogController {

	@Autowired
	private MalhaLogService malhaLogService;

	@ApiOperation(value = "Retorna uma lista de Malha Logistica")
	@GetMapping
	public List<MalhaLogistica> lista() {
		return malhaLogService.findAll();
	}

	@ApiOperation(value="Retorna uma malha unica")
	@GetMapping("/{id}")
	public Optional<MalhaLogistica> listaprodutounico(@PathVariable(value = "id") long id) {
		return malhaLogService.findById(id);
	}

	@ApiOperation(value = "Salva uma Malha Logistica")
	@PostMapping
	@Transactional
	public ResponseEntity<MalhaLogDto> cadastrar(@RequestBody @Validated MalhaLogForm form,
			UriComponentsBuilder uriBuilder) {
		MalhaLogistica malha = malhaLogService.save(form);
		URI uri = uriBuilder.path("/malhas/{id}").buildAndExpand(malha.getId()).toUri();
		return ResponseEntity.created(uri).body(new MalhaLogDto(malha));
	};

	@ApiOperation(value = "Atualiza")
	@PutMapping("/{id}")
	@Transactional
	public ResponseEntity<MalhaLogDto> atualizar(@PathVariable Long id,
			@RequestBody @Validated AtualizacaoForm form) {
		MalhaLogistica malha = malhaLogService.update(id, form);

		return ResponseEntity.ok(new MalhaLogDto(malha));
	}

	@ApiOperation(value = "Deleta uma Malha Logistica")
	@DeleteMapping("/{id}")
	@Transactional

	public ResponseEntity<?> remover(@RequestBody @PathVariable long id) {
		malhaLogService.delete(id);
		return ResponseEntity.noContent().build();
	}

}
