package com.example.demo.error;


public class FuncionarioNotFoundException extends RuntimeException {

	public FuncionarioNotFoundException(Long id) {
		super("Funcionario id not found: " + id);
	}
}
