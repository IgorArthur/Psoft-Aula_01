package controller;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Lot;
import model.Product;
import repository.LotRepository;

public class LotController {
    private LotRepository lotRepository = new LotRepository();

    public void createLot(int quantity, LocalDate validity, Product product) {
        lotRepository.createLot(quantity, validity, product);
    }

    public void listLots() {
        ArrayList<Lot> lotList = lotRepository.listLots();
        String list = "Lista de lotes:\n";
        
        for (Lot lot: lotList) {
            list += lot.getProduct().getName() + " - " + lot.getValidity() + "\n";
        }

        System.out.println(list);

    }

    public Lot findLotByProductName(String productName) throws Exception {
        return lotRepository.findLotByProductName(productName);
    }
}
