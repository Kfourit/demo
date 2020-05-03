package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author Tiago Kfouri
 * @version 1.0
 * 
 * @apiNote Controller class, responsible for handling HTTP requests
 *
 */
@RestController
public class FuncionarioController {
	
	@Autowired
	private FuncionarioService funcionarioService;
	
	//List all
	@GetMapping("/funcionarios")
	List<Funcionario> findAll(){
		return funcionarioService.findAll();
	}
	
	//Find by Id
	@GetMapping("/funcionarios/{id}")
    Funcionario findById(@PathVariable Integer id) {
        return funcionarioService.findById(id);
    }
	
	//Save
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/funcionarios")
    Funcionario saveFuncionario(@RequestBody Funcionario newFuncionario) {
        return funcionarioService.save(newFuncionario);
    }
	
	//Update
	@PutMapping("funcionarios/{id}")
    public Funcionario update(@RequestBody Funcionario funcionario){
        return funcionarioService.save(funcionario);
    }
	
	//Delete
	@DeleteMapping("/funcionarios/{id}")
	void deleteFuncionario(@PathVariable Integer id) {
		funcionarioService.deleteById(id);
	}
	

}
