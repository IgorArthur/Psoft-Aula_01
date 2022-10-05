package model;
import java.time.LocalDate;

public class Lot {

    public Lot(int quantity, LocalDate validity, Product product) {
        this.quantity = quantity;
        this.validity = validity;
        this.product = product;
    }

    private int quantity;
    private LocalDate validity;
    private Product product;

    public void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public void setValidity(LocalDate newValidity) {
        this.validity = newValidity;
    }

    public void setProduct(Product newProduct) {
        this.product = newProduct;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public LocalDate getValidity() {
        return this.validity;
    }

    public Product getProduct() {
        return this.product;
    }
}
