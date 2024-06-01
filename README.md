# Sistema de Gerenciamento de Funcionários

Este projeto é um sistema simples de gerenciamento de funcionários, desenvolvido em Java. Ele permite cadastrar, listar, buscar, remover e modificar funcionários e gerentes. Os gerentes têm atributos adicionais como setor e bônus.

## Funcionalidades

1. **Cadastrar Funcionário/Gerente**: Permite o cadastro de funcionários e gerentes com informações como nome, ID, departamento, salário e data de admissão. Gerentes têm atributos adicionais: setor e bônus.
2. **Listar Funcionários**: Lista todos os funcionários cadastrados, com opção de ordenação por ID, nome ou departamento.
3. **Buscar Funcionário**: Busca um funcionário pelo seu ID e exibe suas informações detalhadas.
4. **Remover Funcionário**: Remove um funcionário do sistema pelo seu ID, com confirmação.
5. **Modificar Funcionário**: Modifica as informações de um funcionário existente, incluindo atributos específicos de gerentes.

## Estrutura do Projeto

### Classe `Funcionario`

Representa um funcionário com os seguintes atributos:
- `nome` (String)
- `id` (int)
- `departamento` (String)
- `salario` (double)
- `dataAdmissao` (String)

### Classe `Gerente`

Herda de `Funcionario` e adiciona os seguintes atributos:
- `setor` (String)
- `bonus` (double)

### Classe `Principal`

Contém o método `main` e gerencia a interação com o usuário através de um menu. Possui os seguintes métodos:
- `inicializarFuncionarios()`: Inicializa a lista de funcionários com alguns dados predefinidos.
- `menu()`: Exibe o menu principal e gerencia a navegação pelas opções.
- `cadastrarFuncionario(Scanner scanner)`: Cadastra um novo funcionário ou gerente.
- `listarFuncionarios(Scanner scanner)`: Lista todos os funcionários, permitindo ordenação.
- `buscarFuncionario(Scanner scanner)`: Busca e exibe um funcionário pelo ID.
- `removerFuncionario(Scanner scanner)`: Remove um funcionário pelo ID.
- `modificarFuncionario(Scanner scanner)`: Modifica as informações de um funcionário pelo ID.

## Uso

### Pré-requisitos

- Java JDK instalado
- IDE de sua escolha (Eclipse, IntelliJ, etc.) ou um editor de texto com suporte para Java