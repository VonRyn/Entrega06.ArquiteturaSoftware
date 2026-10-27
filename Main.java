package mvcjava;

import mvcjava.controller.ProdutoController;
import mvcjava.view.ProdutoView;

public class Main {
    public static void main(String[] args) {
        ProdutoController controller = new ProdutoController(new ProdutoView());
        controller.iniciar();
    }
}
