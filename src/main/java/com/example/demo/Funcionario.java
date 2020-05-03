package com.example.demo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * @author Tiago Kfouri
 * @version 1.0
 * 
 * @apiNote Entity Funcionario
 * 
 */
@Entity
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="funcionario_seq")
	private Integer idFuncionario;
	private String nome;
	private Integer ativo; //0 para inativo e 1 para ativo
	private Integer sexo; //0 para masculino e 1 para feminino
	private String cpf;
	@Temporal(TemporalType.DATE)
	private Date nascimento;
	private String rg;
	private String cargo;
	private String descricao;
	private String imagem;
	private String atestadoDeSaude;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name="funcionario_atividade",
			joinColumns = @JoinColumn(name="idFuncionario",
										referencedColumnName = "idFuncionario"),
			inverseJoinColumns = @JoinColumn(name = "idAtividade",
										referencedColumnName = "idAtividade"))
	private List<Atividade> atividades;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer isAtivo() {
		return ativo;
	}
	public void setAtivo(Integer ativo) {
		this.ativo = ativo;
	}
	public Integer getSexo() {
		return sexo;
	}
	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getAtestadoDeSaude() {
		return atestadoDeSaude;
	}
	public void setAtestadoDeSaude(String atestadoDeSaude) {
		this.atestadoDeSaude = atestadoDeSaude;
	}
	
	public void addAtividade(Atividade atividade) {
		if(this.atividades == null) {
			List<Atividade> atividades = new ArrayList<Atividade>();
			this.atividades = atividades;
		}
		this.atividades.add(atividade);	
	}
	public void removeAtividade(Atividade atividade) {
		try {
			this.atividades.remove(atividade);
		}
		catch(NullPointerException e) {
			System.out.println("Error: " + e);
		}
	}
	@Override
	public String toString() {
		return "Funcionario [idFuncionario=" + idFuncionario + ", nome=" + nome + ", ativo=" + ativo + ", sexo=" + sexo
				+ ", cpf=" + cpf + ", nascimento=" + nascimento + ", rg=" + rg + ", cargo=" + cargo + ", descricao="
				+ descricao + ", imagem=" + imagem + ", atestadoDeSaude=" + atestadoDeSaude + ", atividades="
				+ atividades + "]";
	}
	
	
	

}
