package by.warlock;

public class Main {
   public static void main(String[] args) {
        PostCell[] postCells = {
                new PostCell(new Dimensions(10.5, 5, 5), PostCellStatus.WORK),
                new PostCell(new Dimensions(10.5, 5, 5), PostCellStatus.WORK),
                new PostCell(new Dimensions(10.5, 5, 5), PostCellStatus.WORK),
                new PostCell(new Dimensions(10.5, 5, 5), PostCellStatus.WORK),
                new PostCell(new Dimensions(10.5, 5, 5), PostCellStatus.WORK)
        };
        Postamat postamat = new Postamat(postCells);

        Shipment shipment1 = new Shipment(new Dimensions(5.5, 3, 2), 0.5, "From AliExpress");
        Shipment shipment2 = new Shipment(new Dimensions(5.5, 3, 2), 2, "From AliExpress");
        Shipment shipment3 = new Shipment(new Dimensions(12, 6, 2), 0.5, "From AliExpress");
        Shipment shipment4 = new Shipment(new Dimensions(13, 5, 7), 1, "From AliExpress");
        Shipment shipment5 = new Shipment(new Dimensions(10, 4.5, 2), 0.5, "From AliExpress");

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
