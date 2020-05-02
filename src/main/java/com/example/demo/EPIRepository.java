package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author Tiago Kfouri
 * @version 1.0
 * 
 * @apiNote This interface extends JpaRepository, which contains all CRUD operations
 *
 */
public interface EPIRepository extends JpaRepository<EPI, Long>{
}
