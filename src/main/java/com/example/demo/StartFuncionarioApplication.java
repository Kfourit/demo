package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/**
 * @author Tiago Kfouri
 * @version 1.0
 * 
 * @apiNote Class to start the REST web application.
 *
 */
@SpringBootApplication
public class StartFuncionarioApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(StartFuncionarioApplication.class, args);
    }

	// uncomment this if you want to init database with dump entities
	/*
    @Bean
    CommandLineRunner initDatabase(FuncionarioRepository funcionarioRepository, AtividadeRepository atividadeRepository,
    		EPIRepository epiRepository) {
        return args -> {
        	
        	Funcionario funcionario = this.createDumpFuncionario();
        	Atividade atividade = this.createDumpAtividade();
        	EPI epi = this.createDumpEPI();
     	
        	atividade.addEPI(epi);
        	funcionario.addAtividade(atividade);
        	
        	//System.out.println(atividade);
        	
        	//epiRepository.save(epi);
        	//atividadeRepository.save(atividade);
            //funcionarioRepository.save(funcionario);
                     
        };
    }
    */
    
    
    private Atividade createDumpAtividade() {
    	Atividade atividade = new Atividade();
    	atividade.setNome("atividade1");
    	return atividade;
    }
    
    private Funcionario createDumpFuncionario() {
    	
    	Funcionario funcionario = new Funcionario();  	
    	
    	funcionario.setNome("tiago");
    	funcionario.setAtivo(1);
    	funcionario.setCargo("chefe");
    	funcionario.setSexo(0);
 	
    	return funcionario;
    }
    
    private EPI createDumpEPI() {
    	
    	EPI epi = new EPI();
    	
    	epi.setNome("epi1");
    	epi.setNumeroCA("9876");
    	
    	return epi;
    }
	

}
