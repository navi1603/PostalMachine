package by.warlock;

public class Postamat {
    private int numberOfCell;
    private PostCell[] postCells;


    public Postamat() {
        postCells = new PostCell[10];
    }

    public Postamat(PostCell[] postCells) {
        this.postCells = postCells;
    }

    public int putShipment(Shipment shipment) {
        for (int i = 0; i < postCells.length; i++) {
            if (postCells[i].hasShipment() == false) {
                postCells[i].putShipment(shipment);
                return i;
            }
        }
        return -1;
    }

    public PostCell getShipment(int numberOfCell) {
        return postCells[numberOfCell];
    }

    public double weightAllShipments() {
        double weight = 0;
        for (PostCell postCell : postCells) {
            if(postCell.hasShipment() == true) {
                weight += postCell.getShipment().weight();
            }
        }
        return weight;
    }

}
