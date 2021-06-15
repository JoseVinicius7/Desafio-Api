package br.com.malhaLogistica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.malhaLogistica.models.MalhaLogistica;

public interface MalhalogRepository extends JpaRepository<MalhaLogistica, Long>{

	}
