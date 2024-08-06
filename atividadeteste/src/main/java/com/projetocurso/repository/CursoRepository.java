package com.projetocurso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.query.Param;

import com.projetocurso.entities.Curso;



public interface CursoRepository extends JpaRepository<Curso,Long> {

	@Query("SELECT a FROM Curso a WHERE a.nome = :nome")
	List<Curso> findByNome(@Param("nome") String nome);

}
