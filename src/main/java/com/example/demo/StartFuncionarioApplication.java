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

	// uncomment this if you want to init database with a dump funcionario and atividade
	/*
    @Bean
    CommandLineRunner initDatabase(FuncionarioRepository funcionarioRepository, AtividadeRepository atividadeRepository) {
        return args -> {
        	
        	Funcionario funcionario = this.createDumpFuncionario();
        	Atividade atividade = this.createDumpAtividade();
     	
        	funcionario.addAtividade(atividade);
        	
        	atividadeRepository.save(atividade);
            funcionarioRepository.save(funcionario);
            
            
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
	

}
