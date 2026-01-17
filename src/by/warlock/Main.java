package by.warlock;

public class Main {
    static void main(String[] args) {
        PostCell[] postCells = {
                new PostCell(new Dimensions(10.5, 5, 5), ShipmentStatus.WORK),
                new PostCell(new Dimensions(10.5, 5, 5), ShipmentStatus.WORK),
                new PostCell(new Dimensions(10.5, 5, 5), ShipmentStatus.WORK),
                new PostCell(new Dimensions(10.5, 5, 5), ShipmentStatus.WORK),
                new PostCell(new Dimensions(10.5, 5, 5), ShipmentStatus.WORK)
        };
        Postamat postamat = new Postamat(postCells);

        Shipment shipment1 = new Shipment(new Dimensions(5.5, 3, 2), 0.5, "From AliExpress");
        Shipment shipment2 = new Shipment(new Dimensions(5.5, 3, 2), 0.5, "From AliExpress");
        Shipment shipment3 = new Shipment(new Dimensions(12, 6, 2), 0.5, "From AliExpress");
        Shipment shipment4 = new Shipment(new Dimensions(13, 5, 7), 0.5, "From AliExpress");



    }
}
