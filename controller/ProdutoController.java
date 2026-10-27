package mvcjava.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import mvcjava.model.Produto;
import mvcjava.view.ProdutoView;

/** Controller: único mediador entre Model e View. */
public class ProdutoController {
    private final List<Produto> produtos = new ArrayList<>();
    private final ProdutoView view;

    public ProdutoController(ProdutoView view) {
        this.view = view;
    }

    public void cadastrarProduto(String nome, double preco) {
        produtos.add(new Produto(nome, preco));
    }

    public void listarProdutos() {
        view.exibirListaProdutos(Collections.unmodifiableList(produtos));
    }

    public void iniciar() {
        while (true) {
            String opcao = view.solicitarOpcao();
            switch (opcao) {
                case "1":
                    cadastrarPeloConsole();
                    break;
                case "2":
                    listarProdutos();
                    break;
                case "0":
                    view.exibirMensagem("Aplicação encerrada.");
                    return;
                default:
                    view.exibirMensagem("Opção inválida. Tente novamente.");
            }
        }
    }

    private void cadastrarPeloConsole() {
        String nome = view.solicitarNome();
        String precoTexto = view.solicitarPreco();
        try {
            double preco = Double.parseDouble(precoTexto.replace(',', '.'));
            cadastrarProduto(nome, preco);
            view.exibirMensagem("Produto cadastrado com sucesso!");
        } catch (NumberFormatException ex) {
            view.exibirMensagem("Preço inválido. Informe um número, como 59,90.");
        } catch (IllegalArgumentException ex) {
            view.exibirMensagem("Não foi possível cadastrar: " + ex.getMessage());
        }
    }
}
