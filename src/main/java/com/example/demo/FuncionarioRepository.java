package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author Tiago Kfouri
 * @version 1.0
 * 
 * This interface extends JpaRepository, which contains all CRUD operations
 *
 */
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{
}
