# Exercício MVC em Java - Arquitetura de Software

**Aluno:** Christian Gustavo Von Ryn  
**RGM:** 43384323

Aplicação Java de console para cadastrar e listar produtos, usando Model-View-Controller, conforme a opção B do exercício.

## Organização

```text
mvcjava/
  Main.java
  model/Produto.java
  view/ProdutoView.java
  controller/ProdutoController.java
```

- **Model**: dados e validação de nome e preço, sem apresentação.
- **View**: recebe entrada e exibe resultados, sem acessar o armazenamento.
- **Controller**: guarda a coleção em memória e faz a mediação entre Model e View.
- **Main**: inicia a aplicação.

## Executar

Abra o terminal na pasta que contém `mvcjava` e execute:

```bash
javac mvcjava/Main.java mvcjava/model/Produto.java mvcjava/view/ProdutoView.java mvcjava/controller/ProdutoController.java
java mvcjava.Main
```

Requer JDK. Escolha `1` para cadastrar, `2` para listar ou `0` para sair. Os produtos ficam apenas na memória e são perdidos ao encerrar.
