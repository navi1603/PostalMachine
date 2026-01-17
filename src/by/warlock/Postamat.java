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

    public void putShipment(Shipment shipment) {
        for (int i = 0; i < postCells.length; i++) {
            if (postCells[i] == null) {
                postCells[i].putShipment(shipment);
                break;
            }
        }
    }

    public PostCell getShipment(int numberOfCell) {

        return null;
    }

    public double weightAllShipments() {
        return 0;
    }

}
