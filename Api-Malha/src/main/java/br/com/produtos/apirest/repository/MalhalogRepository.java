package br.com.produtos.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.produtos.apirest.models.MalhaLogistica;

public interface MalhalogRepository extends JpaRepository<MalhaLogistica, Long>{

	}
