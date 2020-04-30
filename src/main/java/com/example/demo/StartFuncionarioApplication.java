package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


/**
 * @author Tiago Kfouri
 * @version 1.0
 * 
 * Class to start the REST web application. It inserts 3 funcionarios on db
 *
 */
@SpringBootApplication
public class StartFuncionarioApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(StartFuncionarioApplication.class, args);
    }

	// init bean to insert 3 funcionarios into database.
    @Bean
    CommandLineRunner initDatabase(FuncionarioRepository repository) {
        return args -> {
            repository.save(new Funcionario("Roberto"));
            repository.save(new Funcionario("Pedro"));
            repository.save(new Funcionario("Joao"));
        };
    }
	

}
