package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * @author Tiago Kfouri
 * @version 1.0
 * 
 * Entity Funcionario
 *
 */
@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="funcionario_seq")
	private Integer id;
	private String name;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Funcionario() {
		super();
	}
	public Funcionario(String name) {
		super();
		this.name = name;
	}
	
	

}
