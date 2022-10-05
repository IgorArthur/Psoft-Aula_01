package controller;

import repository.ProductRepository;
import java.util.ArrayList;
import model.Product;

public class ProductController {

    private ProductRepository productRepository = new ProductRepository();

    public void createProduct(String name, String provider, double price) {
        productRepository.createProduct(name, provider, price);
    }

    public void listProducts() {
        ArrayList<Product> productList = productRepository.listProducts();
        String list = "Lista de produtos:\n";
        
        for (Product product: productList) {
            list += product.getName() + "\n";
        }

        System.out.println(list);

    }

    public Product findProductByName(String name) throws Exception {
        return productRepository.findProductByName(name);
    }
}
