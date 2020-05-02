package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.error.FuncionarioNotFoundException;

@RestController
public class FuncionarioController {
	
	@Autowired
	private FuncionarioRepository repository;
	
	//List all
	@GetMapping("/funcionarios")
	List<Funcionario> findAll(){
		return repository.findAll();
	}
	
	//Find by Id
	@GetMapping("/funcionarios/{id}")
    Funcionario findOne(@PathVariable Integer id) {
        return repository.findById(id)
                .orElseThrow(() -> new FuncionarioNotFoundException(id));
    }
	
	//Save
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/funcionarios")
    Funcionario newFuncionario(@RequestBody Funcionario newFuncionario) {
        return repository.save(newFuncionario);
    }
	
	//Delete
	@DeleteMapping("/funcionarios/{id}")
	void deleteFuncionario(@PathVariable Integer id) {
		repository.deleteById(id);
	}
	
	//Error
	@GetMapping("/error")
	void throwError() {
		throw new UnknownError();
	}
	

}
