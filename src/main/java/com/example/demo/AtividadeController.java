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
public class AtividadeController {
	
	@Autowired
	private AtividadeService atividadeService;
	
	//List all
	@GetMapping("/atividades")
	List<Atividade> findAll(){
		return atividadeService.findAll();
	}
	
	//Find by Id
	@GetMapping("/atividades/{id}")
    Atividade findById(@PathVariable Integer id) {
        return atividadeService.findById(id);
    }
	
	//Save
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/atividades")
    Atividade saveAtividade(@RequestBody Atividade newAtividade) {
        return atividadeService.save(newAtividade);
    }
	
	//Update
	@PutMapping("atividades/{id}")
    public Atividade update(@RequestBody Atividade atividade){
        return atividadeService.save(atividade);
    }
	
	//Delete
	@DeleteMapping("/atividades/{id}")
	void deleteAtividade(@PathVariable Integer id) {
		atividadeService.deleteById(id);
	}

}
