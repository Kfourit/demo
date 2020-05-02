package com.example.demo;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author Tiago Kfouri
 * @version 1.0
 * 
 * @apiNote Service contains business logic. It has basic methods of 
 * list, find, save and delete.
 *
 */
@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public List<Funcionario> findAll(){
        return funcionarioRepository.findAll();
    }

    public Funcionario findById(Integer id){
        return funcionarioRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Funcionario save(Funcionario funcionario){
        return funcionarioRepository.save(funcionario);
    }

    public void deleteById(Integer id){
        funcionarioRepository.deleteById(id);
    }
}
