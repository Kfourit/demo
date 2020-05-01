package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;


/**
 * @author Tiago Kfouri
 * @version 1.0
 *
 */
@Entity
public class Atividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="atividade_seq")
	private Integer idAtividade;
	private String nome;
	
	@ManyToMany(mappedBy = "atividades", fetch = FetchType.LAZY)
	private List<Funcionario> funcionarios;
	
	@OneToMany(mappedBy = "atividade", fetch = FetchType.LAZY)
	private List<EPI> EPIs = new ArrayList<EPI>(0);
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	

}
