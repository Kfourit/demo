CREATE SCHEMA desafio AUTHORIZATION postgres;


CREATE TABLE desafio.funcionario (
	id_funcionario int4 NOT NULL,
	nome varchar NULL,
	ativo int4 NULL,
	sexo int4 NULL,
	cpf varchar NULL,
	nascimento date NULL,
	rg varchar NULL,
	cargo varchar NULL,
	descricao varchar NULL,
	atestado_de_saude varchar NULL,
	imagem varchar NULL,
	CONSTRAINT funcionario_pkey PRIMARY KEY (id_funcionario)
);

CREATE TABLE desafio.atividade (
	id_atividade int4 NOT NULL,
	nome varchar NULL,
	CONSTRAINT "Atividade_pkey" PRIMARY KEY (id_atividade)
);

CREATE TABLE desafio.epi (
	id_epi int4 NOT NULL,
	nome varchar NULL,
	id_atividade int4 NULL,
	numeroca varchar NULL,
	CONSTRAINT epi_pkey PRIMARY KEY (id_epi),
	CONSTRAINT epi_atividade FOREIGN KEY (id_atividade) REFERENCES desafio.atividade(id_atividade) NOT VALID
);

CREATE TABLE desafio.funcionario_atividade (
	id_funcionario int4 NULL,
	id_atividade int4 NULL,
	CONSTRAINT "idAtividade" FOREIGN KEY (id_atividade) REFERENCES desafio.atividade(id_atividade),
	CONSTRAINT "idFuncionario" FOREIGN KEY (id_funcionario) REFERENCES desafio.funcionario(id_funcionario)
);