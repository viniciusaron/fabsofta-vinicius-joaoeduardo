# Fabrica de Software 2025/1

## Nome da Equipe
- João Eduardo
- Vinicius Aron

## Proposta de projetos

- Nome do sistema: Sistema de gerenciamento de estoque para empresa de venda de pneu
    - Funcionalidade 1 Cadastrar dados do cliente
    - Funcionalidade 2 Cadastrar produto
    - Funcionalidade 3 Buscar por fabricante
    - Funcionalidade 4 Buscar por medida de largura do pneu
    - Funcionalidade 5 Buscar por medida de perfil do pneu
    - Funcionalidade 6 Buscar por tamanho do aro
    - Funcionalidade 7 Buscar por tipo de construção

## Livro Eng Software Moderna
[Eng. Soft Moderna - Requisitos](https://engsoftmoderna.info/cap3.html)

## Histórias de Usuário
- Como um Atendente eu gostaria de cadastrar os dados do cliente como: nome, CPF, e-mail, telefone e endereço
- Como um Atendente eu gostaria de consultar em meu sistema os dados do cliente como: nome, CPF, e-mail, telefone e endereço
- Como um Gerente de estoque eu gostaria de cadastrar os produtos da minha loja como: fabricante, tamanho do aro, largura do pneu, perfil do pneu e tipo de construção
- Como um Gerente de estoque eu gostaria de consultar as informações em meu sistema como: fabricante, tamanho do aro, largura do pneu, perfil do pneu e tipo de construção
- Como o CEO eu gostaria de cadastrar meu funcionario como: nome, CPF, e-mail, telefone, endereço e cargo

## Comandos do Git

### Instalação
[Git Bash](https://git-scm.com/downloads)

### Configuração inicial

```
git config --global user.name "NOME DO USUARIO NO GITHUB"
git config --global user.email "EMAIL DA CONTA DO GITHUB"
```
### Tipos de mensagens do commit

- feat: (new feature for the user, not a new feature for build script)
- fix: (bug fix for the user, not a fix to a build script)
- docs: (changes to the documentation)
- style: (formatting, missing semi colons, etc; no production code change)
- refactor: (refactoring production code, eg. renaming a variable)
- test: (adding missing tests, refactoring tests; no production code change)
- chore: (updating grunt tasks etc; no production code change)

### Commit e Push

```
git add .
git commit -m "tipo: o que foi feito"
git push -u origin main
```

### Criar um branch a partir da branch atual
```
git checkout -b branch-seunome
```

### Revisão de Java

[Download JDK](https://adoptium.net/)

- JRE - Java Runtime Environment (java.exe)
  - Máquina virtual do Java - interpreta o Bytecode(.class) do Java para linguagem de máquina
- JDK - Java Development Kit (javac.exe)
  - Compilar o código Java em bytecode (.class)


### Criação de projeto no VSCode com Maven
1) teclar F1
2) digitar Java e escolher a opção create ne java project
3) project type: MAVEN
4) Archetype: no Archetype
5) pacote digitar domínio ao contrário ex: br.univille
6) nome do projeto em minúsculo
7) usar a pasta sugerida pelo VSCode

### Site sobre Design Patterns
https://refactoring.guru/design-patterns

### Diagrama de classes
![Diagrama de Classes](./diagramas/png/classes.png)

### Criar as entidades
```bash
@workspace #sym:## Histórias de Usuário por favor, encontre as entidades
```

### Gerar as classes Java das entidades
```bash
@workspace por favor, gere no pacote br.univille.projfabsoft.entity as classes java para representar as entidades
```

### Gerar o diagrama de entidades UML
```bash
@workspace por favor, gere um diagrama uml utilizando o padrão plantuml para as classes no pacote br.univille.projfabsoft.entity
```