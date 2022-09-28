import java.time.LocalDate;

import model.Lote;
import model.Product;

class Main {
    public static void main(String[] args) {
        Product s10 = new Product(
                "Galaxy S10",
                "Samsung",
                2000.00);

        Lote lote = new Lote(10, LocalDate.parse("2019-05-11"), s10);

    }
}

// Produtos com nome, fabricante e peça.
// Podem existir lotes associados aos produtos, com quantidade e data de
// fabricação.