package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author Tiago Kfouri
 * @version 1.0
 * 
 * @apiNote Entity EPI
 *
 */
@Entity
public class EPI {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="epi_seq")
	private Integer idEPI;
	private String nome;
	private String numeroCA;
	
	@JoinColumn(name = "idAtividade")
	@ManyToOne(fetch = FetchType.EAGER)
	private Atividade atividade;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNumeroCA() {
		return numeroCA;
	}
	public void setNumeroCA(String numeroCA) {
		this.numeroCA = numeroCA;
	}
	
	
}
