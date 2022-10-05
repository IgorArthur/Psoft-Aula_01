package repository;

import java.util.ArrayList;

import model.Product;

public class ProductRepository {
    public ProductRepository() {
    }

    private ArrayList<Product> productList = new ArrayList<Product>();

    public void createProduct(String name, String provider, double price) {
        Product product = new Product(name, provider, price);

        productList.add(product);
    }

    public ArrayList<Product> listProducts() {
        return productList;
    }

    public Product findProductByName(String name) throws Exception {
        for (Product product: productList) {
            if (product.getName().equals(name)) {
                return product;
            }
        }

        throw new NullPointerException("Produto não encontrado!");
    }
}
