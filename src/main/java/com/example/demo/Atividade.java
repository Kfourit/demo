package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
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
 * @apiNote Entity Atividade
 *
 */
@Entity
public class Atividade {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="atividade_seq")
	private Integer idAtividade;
	private String nome;
	
	@ManyToMany(mappedBy = "atividades", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private List<Funcionario> funcionarios;
	
	@OneToMany(mappedBy = "atividade", fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	private List<EPI> epis = new ArrayList<EPI>(0);
	
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void addFuncionario(Funcionario funcionario) {
		if(this.funcionarios == null) {
			List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			this.funcionarios = funcionarios;
		}
		this.funcionarios.add(funcionario);	
	}
	public void removeFuncionario(Funcionario funcionario) {
		try {
			this.funcionarios.remove(funcionario);
		}
		catch(NullPointerException e) {
			System.out.println("Error: " + e);
		}
	}
	
	public void addEPI(EPI epi) {
		if(this.epis == null) {
			List<EPI> atividades = new ArrayList<EPI>();
			this.epis = atividades;
		}
		this.epis.add(epi);	
	}
	public void removeEPI(EPI epi) {
		try {
			this.epis.remove(epi);
		}
		catch(NullPointerException e) {
			System.out.println("Error: " + e);
		}
	}
	@Override
	public String toString() {
		return "Atividade [idAtividade=" + idAtividade + ", nome=" + nome + ", funcionarios=" + funcionarios + ", epis="
				+ epis + "]";
	}
	
	

}
