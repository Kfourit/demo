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
public class AtividadeService {

	@Autowired
	private AtividadeRepository atividadeRepository;
	
	public List<Atividade> findAll(){
        return atividadeRepository.findAll();
    }

    public Atividade findById(Integer id){
        return atividadeRepository.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public Atividade save(Atividade atividade){
        return atividadeRepository.save(atividade);
    }

    public void deleteById(Integer id){
        atividadeRepository.deleteById(id);
    }
}
