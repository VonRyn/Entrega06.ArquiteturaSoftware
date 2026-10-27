package mvcjava.view;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import mvcjava.model.Produto;

/** View: única camada que lê e escreve no console. */
public class ProdutoView {
    private final Scanner scanner = new Scanner(System.in);

    public String solicitarOpcao() {
        System.out.println("\n=== CADASTRO DE PRODUTOS (MVC) ===");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("0 - Sair");
        System.out.print("Escolha uma opção: ");
        return scanner.nextLine().trim();
    }

    public String solicitarNome() {
        System.out.print("Nome do produto: ");
        return scanner.nextLine();
    }

    public String solicitarPreco() {
        System.out.print("Preço (ex.: 59,90): ");
        return scanner.nextLine().trim();
    }

    public void exibirProduto(Produto produto) {
        System.out.printf(Locale.forLanguageTag("pt-BR"),
                "%-28s | R$ %,.2f%n", produto.getNome(), produto.getPreco());
    }

    public void exibirListaProdutos(List<Produto> produtos) {
        System.out.println("\n=== PRODUTOS CADASTRADOS ===");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }
        for (Produto produto : produtos) {
            exibirProduto(produto);
        }
        System.out.println("Total de produtos: " + produtos.size());
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}
