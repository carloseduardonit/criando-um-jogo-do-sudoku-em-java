# Criando de um Jogo do sudoku em java

![GIT](https://img.shields.io/badge/Git-F05032.svg?style=for-the-badge&logo=Git&logoColor=white)![GitHub](https://img.shields.io/badge/GitHub-181717.svg?style=for-the-badge&logo=GitHub&logoColor=white)![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)


||
|:---:|  
|![Imagem do Sudoku](image.png)|

## Regras básicas

- Grade: A grade principal tem \(9\) linhas e \(9\) colunas, formando \(81\) células no total. Ela é dividida em nove blocos menores de \(3\times 3\).
- Números: Você deve usar apenas os números de \(1\) a \(9\).

- Linhas, colunas e blocos: Cada linha, coluna e bloco \(3\times 3\) deve conter todos os números de \(1\) a \(9\).
- Sem repetições: Um mesmo número não pode aparecer mais de uma vez em uma mesma linha, coluna ou bloco.
- Objetivo: O jogo termina quando toda a grade está completamente preenchida, seguindo todas as regras.

### Card  de Atividade

- [ ] Criar Validação se o Valor do numero esta entre 0 a 10
  - [ ] Criar  Mensageria se o numero é maior do que 9
  - [ ] Criar  Mensageria se o numero é menor do que 1
- [ ] Criar a Inserção do valor do quadro Maior
  - [ ] Criar Validaçao se  o valor da coluna esta entre 0 a 10
    - [ ] Verificar se o numero não consta na coluna
  - [ ] Criar Validaçao se  o valor da linha esta entre 0 a 10
    - [ ] Verificar se o numero não consta na linha
- [ ] Criar a Inserção do valores dos quadros menores
  - [ ] Verificar se o numero não consta nas colunas e nas linhas

## Validação de Entrada do Número

- Validar se o valor informado está entre **0 e 10**
  - Exibir mensagem caso o número seja **maior que 9**
  - Exibir mensagem caso o número seja **menor que 1**

---

## ✅ Inserção do Valor no Quadro Maior

- Inserir valor no quadro maior
  - Validar se o valor da **coluna** está entre 0 e 10
    - Verificar se o número **não existe na coluna**
  - Validar se o valor da **linha** está entre 0 e 10
    - Verificar se o número **não existe na linha**
  - Verificar se o número não viola outras regras (ex: duplicidade geral, caso necessário)
  - Confirmar inserção após passar por todas as validações

---

## ✅ Inserção dos Valores nos Quadros Menores

- Inserir valor nos quadros menores
  - Verificar se o número **não consta nas colunas**
  - Verificar se o número **não consta nas linhas**
  - Verificar se o número **não existe no quadro menor**
  - Criar mensagens específicas para cada tipo de violação
  - Criar função de validação única para evitar código duplicado
