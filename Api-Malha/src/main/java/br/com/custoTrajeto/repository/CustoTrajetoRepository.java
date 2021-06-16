package br.com.custoTrajeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.custoTrajeto.models.Trajeto;

public interface CustoTrajetoRepository extends JpaRepository<Trajeto, Long>{

}
