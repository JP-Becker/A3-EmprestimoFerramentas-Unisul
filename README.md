# Interface para empréstimo de ferramentas

## 📖 Introdução 
Projeto para a UC de programação do curso de Sistemas de Informação. Consiste em uma interface gráfica para registrar amigos, ferramentas e conceder e gerenciar empréstimos
dessas ferramentas para esses amigos, com tudo sendo registrado em um banco de dados com mySQL.

## 🧭Status do Projeto
- ⏳Em andamento.

## 💻Tecnologias utilizadas
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![JavaFX](https://img.shields.io/badge/javafx-%23FF0000.svg?style=for-the-badge&logo=javafx&logoColor=white)
![MySQL](https://img.shields.io/badge/mysql-4479A1.svg?style=for-the-badge&logo=mysql&logoColor=white)
![NetBeans IDE](https://img.shields.io/badge/NetBeansIDE-1B6AC6.svg?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)


  ### Principais funcionalidades
```bash
. CRUD de amigos: Criar, ler, atualizar ou deletar amigos da BD.
. CRUD de ferramentas: Criar, ler, atualizar ou deletar ferramentas da BD.
. CRUD de empréstimos: Criar, ler, atualizar ou deletar empréstimos da BD.
. Interface gráfica: Possui uma interface gráfica feita com JavaFX para ser possível realizar cada uma das funcionalidades.
```

  ### Requisitos Funcionais e não funcionais
```bash
. RF001 - Cadastrar ferramentas com nome, marca e custo.
. RF002 - Cadastrar amigo com nome, telefone e e-mail.
. RF003 - Registrar o empréstimo da(s) ferramentas(s) ao amigo, incluindo a data 
de empréstimo e devolução.
. RF004 - O programa deve ter uma lista de todas as ferramentas e o valor gasto 
nelas.
. RF005 - Mostrar relatório de todos os empréstimos ativos.
. RF006 - Mostrar relatório de todos os empréstimos realizados.
. RF007 - Mostrar qual amigo fez mais empréstimos.
. RF008 - Mostrar se algum amigo nunca devolveu uma ferramenta.
. RF009 - Ao fazer um novo empréstimo, mostrar se o amigo tem alguma
ferramenta não devolvida.
------------------------------------------------------------------------------------
. RNF001 - O programa deve rodar localmente em um computador pessoal.
. RNF002 - O programa deve ser desenvolvido em Java.
. RNF002 - O programa deve ser conectado a uma base de dados usando mySQL.
```

## Configurando BD
Usuário: root

Senha: root

## 💡IDE utilizada:
- NetBeans