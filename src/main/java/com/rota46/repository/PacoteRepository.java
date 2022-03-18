package com.rota46.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rota46.model.Pacote;

@Repository
public interface PacoteRepository extends JpaRepository<Pacote, Long>{

}
