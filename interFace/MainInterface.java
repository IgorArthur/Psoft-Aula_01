package interFace;

import java.time.LocalDate;

import controller.LotController;
import controller.ProductController;
import model.Product;

public class MainInterface {
    public MainInterface(){}

    private ProductController productController = new ProductController();
    private LotController lotController = new LotController();

    public void init() throws Exception {
        System.out.println("Bem vindo Mercado Virtual!" +
                        "\n===========================\n" +
                        "O que deseja fazer?\n" +
                        "(1) Cadastrar Produto\n" +
                        "(2) Cadastrar Lote\n" +
                        "(3) Listar Produtos\n" +
                        "(4) Listar Lotes\n" 
                        );

        createProduct("Galaxy S10e", "Samsung", 2000);
        createProduct("iPhone XR", "Apple", 2500);
        createLot(40, LocalDate.parse("2022-10-12"), productController.findProductByName("Galaxy S10e"));
        createLot(60, LocalDate.parse("2024-10-12"), productController.findProductByName("iPhone XR"));

        listProducts();
        listLots();

    }

    public void createProduct(String name, String provider, double price) {
        productController.createProduct(name, provider, price);
    }

    public void createLot(int quantity, LocalDate validity, Product product) {
        lotController.createLot(quantity, validity, product);
    }

    public void listProducts() {
        productController.listProducts();
    }

    public void listLots() {
        lotController.listLots();
    }
}
