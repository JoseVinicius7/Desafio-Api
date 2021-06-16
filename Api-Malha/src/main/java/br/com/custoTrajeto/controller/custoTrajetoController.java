package br.com.custoTrajeto.controller;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.custoTrajeto.controller.dto.TrajetoDto;
import br.com.custoTrajeto.controller.form.TrajetoForm;
import br.com.custoTrajeto.models.Trajeto;
import br.com.custoTrajeto.service.CustoTrajetoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/trajetos")
@Api(value = "Custo Trajeto")
@CrossOrigin (origins = "*")

public class custoTrajetoController {

	@Autowired
	private CustoTrajetoService custoTrajetoService;

	@ApiOperation(value = "Retorna uma lista de Trajetos")
	@GetMapping
	public List<Trajeto> lista() {
		return custoTrajetoService.findAll();
	}

	@ApiOperation(value = "Salva um Trajeto")
	@PostMapping
	@Transactional
	public ResponseEntity<TrajetoDto> cadastrar(@RequestBody @Validated TrajetoForm form,
			UriComponentsBuilder uriBuilder) {
		Trajeto trajeto = custoTrajetoService.save(form);
		URI uri = uriBuilder.path("/custo-trajeto/{id}").buildAndExpand(trajeto.getId()).toUri();
		return ResponseEntity.created(uri).body(new TrajetoDto(trajeto));
	};

//	@ApiOperation(value = "Atualiza")
//	@PutMapping("/{id}")
//	@Transactional
//	public ResponseEntity<TrajetoDto> atualizar(@PathVariable Long id,
//			@RequestBody @Validated AtualizacaoForm form) {
//		Trajeto trajeto = custoTrajetoService.update(id, form);
//
//		return ResponseEntity.ok(new MalhaLogDto(malha));
//	}

//	@ApiOperation(value = "Deleta um Trajeto")
//	@DeleteMapping("/{id}")
//	@Transactional
//
//	public ResponseEntity<?> remover(@RequestBody @PathVariable long id) {
//		custoTrajetoService.delete(id);
//		return ResponseEntity.noContent().build();
//	}

}
