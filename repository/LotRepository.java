package repository;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Lot;
import model.Product;

public class LotRepository {
    public LotRepository() {
    }

    private ArrayList<Lot> lotList = new ArrayList<Lot>();

    public void createLot(int quantity, LocalDate validity, Product product) {
        Lot lot = new Lot(quantity, validity, product);

        lotList.add(lot);
    }

    public ArrayList<Lot> listLots() {
        return lotList;
    }

    public Lot findLotByProductName(String productName) throws Exception {
        for (Lot lot: lotList) {
            if (lot.getProduct().getName().equals(productName)) {
                return lot;
            }
        }

        throw new NullPointerException("Lote de produto não encontrado!");
    }
}
