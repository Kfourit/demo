package com.example.demo.error;

@SuppressWarnings("serial")
public class FuncionarioNotFoundException extends RuntimeException {

	public FuncionarioNotFoundException(Integer id) {
		super("Funcionario id not found: " + id);
	}
}
