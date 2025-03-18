# Projeto de Gestão de Funcionários

Este projeto foi desenvolvido para gerenciar informações de funcionários em uma empresa, utilizando conceitos de programação orientada a objetos em Java. O sistema manipula dados como nome, data de nascimento, salário e função de cada funcionário, realizando diversas operações, como inserção, atualização, remoção e agrupamento dos funcionários.

## Requisitos do Projeto

O sistema implementa as seguintes funcionalidades de acordo com os requisitos fornecidos:

### 1. Classe `Pessoa`

A classe `Pessoa` representa uma pessoa genérica e contém os seguintes atributos:
- `nome` (String): Nome completo da pessoa.
- `dataNascimento` (LocalDate): Data de nascimento da pessoa.

### 2. Classe `Funcionário`

A classe `Funcionário` estende a classe `Pessoa` e adiciona dois atributos adicionais:
- `salario` (BigDecimal): Salário do funcionário.
- `funcao` (String): Função do funcionário na empresa.

### 3. Funcionalidades Implementadas

#### 3.1 Inserção de Funcionários
- Funcionários são inseridos em uma lista a partir de informações fornecidas na tabela de entrada: nome, data de nascimento, salário e função.

#### 3.2 Remoção do Funcionário "João"
- A partir da lista de funcionários, o sistema remove o funcionário cujo nome seja "João".

#### 3.3 Impressão de Todos os Funcionários
- O sistema imprime todos os funcionários com suas informações formatadas da seguinte maneira:
  - A data de nascimento é exibida no formato `dd/mm/aaaa`.
  - O salário é exibido com separador de milhar como ponto e separador decimal como vírgula.

#### 3.4 Aumento Salarial
- Todos os funcionários recebem um aumento de 10% em seu salário. A lista é atualizada com os novos valores de salário.

#### 3.5 Agrupamento de Funcionários por Função
- Os funcionários são agrupados por função em um `Map`, onde a chave é a função e o valor é uma lista de funcionários dessa função.

#### 3.6 Impressão de Funcionários Agrupados por Função
- O sistema imprime os funcionários agrupados por função.

#### 3.7 Funcionários com Aniversário em Outubro e Dezembro
- O sistema imprime os funcionários que fazem aniversário nos meses de outubro e dezembro.

#### 3.8 Funcionário com a Maior Idade
- O sistema encontra e imprime o funcionário com a maior idade, exibindo o nome e a idade.

#### 3.9 Ordenação Alfabética dos Funcionários
- O sistema imprime a lista de funcionários ordenada alfabeticamente por nome.

#### 3.10 Total dos Salários dos Funcionários
- O sistema calcula e imprime o total dos salários de todos os funcionários.

#### 3.11 Cálculo de Salário Mínimo
- O sistema imprime quantos salários mínimos (R$ 1.212,00) cada funcionário recebe, com base no seu salário atual.

## Estrutura do Projeto

- **Classe `Pessoa`**: Contém os atributos `nome` e `dataNascimento`.
- **Classe `Funcionario`**: Estende `Pessoa` e adiciona os atributos `salario` e `funcao`.
- **Classe `Principal`**: Contém o método `main` para executar todas as funcionalidades descritas acima, incluindo a manipulação da lista de funcionários e a aplicação das operações solicitadas.

## Tecnologias Utilizadas

- **Java 8 ou superior**: A linguagem utilizada para desenvolvimento do sistema.
- **BigDecimal**: Para manipulação de valores monetários (salário).
- **LocalDate**: Para manipulação de datas (data de nascimento).
- **Collections**: Utilizado para armazenar e manipular a lista de funcionários e o agrupamento por função (Map).
- **Java 8 Streams**: Para operações de agrupamento, ordenação e filtragem de dados.


