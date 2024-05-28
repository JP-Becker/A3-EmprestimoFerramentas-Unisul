DROP TABLE IF EXISTS tb_amigos;
DROP TABLE IF EXISTS tb_ferramentas;
DROP TABLE IF EXISTS tb_emprestimos;

# criando tabela dos amigos
CREATE TABLE tb_amigos (
    idAmigo INTEGER NOT NULL,
    nomeAmigo VARCHAR(100),
    telefone VARCHAR(100),
    PRIMARY KEY(idAmigo)
);

# criando tabela das ferramentas
CREATE TABLE tb_ferramentas (
    idFerramenta INTEGER NOT NULL,
    nomeFerramenta VARCHAR(100),
    marca VARCHAR(100),
    custo DOUBLE,
    PRIMARY KEY(idFerramenta)
);

# criando tabela dos emprestimos 
CREATE TABLE tb_emprestimos (
    idEmprestimo INTEGER NOT NULL,
    idAmigo INTEGER,
    idFerramenta INTEGER,
    dataEmprestimo DATE,
    dataDevolucao DATE,
    pendente BOOLEAN,
    PRIMARY KEY(idEmprestimo)
);
