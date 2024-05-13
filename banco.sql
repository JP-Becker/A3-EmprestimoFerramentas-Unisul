// FEITO POR JOÃO
CREATE DATABASE IF NOT EXISTS db_a3;

USE db_a3;

DROP TABLE IF EXISTS tb_amigos;


// criadno tabela dos amigos
CREATE TABLE tb_amigos (
    idAmigo INTEGER NOT NULL,
    nomeAmigo VARCHAR(100),
    telefone VARCHAR(100),
    emprestimosTotais VARCHAR(50),
    emprestimosAtivos INTEGER,
    PRIMARY KEY(idAmigo)
);

// criadno tabela das ferramentas
CREATE TABLE tb_ferramentas (
    idFerramenta INTEGER NOT NULL,
    nomeFerramenta VARCHAR(100),
    marca VARCHAR(100),
    custo DOUBLE,
    emrpestada BOOLEAN,
    PRIMARY KEY(idFerramenta)
);


// INSERINDO O PRIMEIRO AMIGO PARA TESTAR
INSERT INTO tb_amigos(idAmigo,nomeAmigo,telefone,emprestimosTotais,emprestimosAtivos) VALUES (1,"João","48999666847","0",0);


INSERT INTO tb_ferramentas(idFerramenta,nomeFerramenta,marca,custo,emprestada) VALUES (1,"chave de fenda","philips","9.99", false);
