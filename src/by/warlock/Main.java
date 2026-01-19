package by.warlock;

import java.math.BigDecimal;

public class Main {
   public static void main(String[] args) {
        PostCell[] postCells = {
                new PostCell(new Dimensions(new BigDecimal("10.5"), new BigDecimal("5"), new BigDecimal("3"))),
                new PostCell(new Dimensions(new BigDecimal("10.5"), new BigDecimal("5"), new BigDecimal("3"))),
                new PostCell(new Dimensions(new BigDecimal("10.5"), new BigDecimal("5"), new BigDecimal("3"))),
                new PostCell(new Dimensions(new BigDecimal("10.5"), new BigDecimal("5"), new BigDecimal("3"))),
                new PostCell(new Dimensions(new BigDecimal("10.5"), new BigDecimal("5"), new BigDecimal("3")))
        };
        Postamat postamat = new Postamat(postCells);

        Shipment shipment1 = new Shipment(new Dimensions(new BigDecimal("8.5"), new BigDecimal("4"), new BigDecimal("1"), 1, "From AliExpress");
        Shipment shipment2 = new Shipment(new Dimensions(new BigDecimal("9.5"), new BigDecimal("1"), new BigDecimal("2"), 0.7, "From AliExpress");
        Shipment shipment3 = new Shipment(new Dimensions(new BigDecimal("11.5"), new BigDecimal("5.2"), new BigDecimal("2.5"), 0.3, "From AliExpress");
        Shipment shipment4 = new Shipment(new Dimensions(new BigDecimal("12.5"), new BigDecimal("7"), new BigDecimal("7"), 0.5, "From AliExpress");
        Shipment shipment5 = new Shipment(new Dimensions(new BigDecimal("10"), new BigDecimal("4,9"), new BigDecimal("3"), 0.5, "From AliExpress");

        int index1 = postamat.putShipment(shipment1);
        int index2 = postamat.putShipment(shipment2);
        int index3 = postamat.putShipment(shipment3);
        int index4 = postamat.putShipment(shipment4);
        int index5 = postamat.putShipment(shipment5);

        System.out.println("Вес помещенных посылок: " + postamat.weightAllShipments());
        System.out.println("Индекс посылку 1: " + index1);
        System.out.println("Индекс посылку 2: " + index2);
        System.out.println("Индекс посылку 3: " + index3);
        System.out.println("Индекс посылку 4: " + index4);
        System.out.println("Индекс посылку 5: " + index5);



    }
}
