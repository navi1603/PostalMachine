package by.warlock;

import java.math.BigDecimal;

public class Postamat {
    private int numberOfCell;
    private final PostCell[] postCells;


    public Postamat() {
        postCells = new PostCell[10];
    }

    public Postamat(PostCell[] postCells) {
        this.postCells = postCells;
    }

    public Integer putShipment(Shipment shipment) {
        for (int i = 0; i < postCells.length; i++) {
            if (postCells[i].canAcceptShipment(shipment)) {
                if(postCells[i].putShipment(shipment)) {
                    System.out.println("Посылка размещена в ячейке");
                }
                return i;
            }
        }
        System.out.println("Не удалось разместить посылку в ячейке");
        return null;
    }

    public Shipment getShipment(int numberOfCell) {
        if(numberOfCell < 0 || numberOfCell >= postCells.length) {
            System.out.println("Ячейка с этим номером не найдена");
        }
        return postCells[numberOfCell].extractShipment();
    }

    public BigDecimal weightAllShipments() {
        BigDecimal weight = new BigDecimal("0");
        for (PostCell postCell : postCells) {
            if(postCell.hasShipment()) {
                weight = weight.add(postCell.shipmentWeight());
            }
        }
        return weight;
    }
}
