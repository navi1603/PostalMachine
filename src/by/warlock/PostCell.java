package by.warlock;

public class PostCell {
    private final Dimensions dimensions;
    private PostCellStatus postCellStatus;
    private Shipment shipment;

    public PostCell(Dimensions dimensions, PostCellStatus postCellStatus) {
        this.dimensions = dimensions;
        this.postCellStatus = postCellStatus;
    }

    public boolean hasShipment() {
        return (shipment == null) ? false : true;
    }

    public boolean canAcceptShipment(Shipment shipment) {
        if(this.shipment == null &&
                postCellStatus == PostCellStatus.WORK &&
                dimensions.height() > shipment.dimensions().height() &&
                dimensions.depth() > shipment.dimensions().depth() &&
                dimensions.width() > shipment.dimensions().width()) {
            return true;
        }
        return false;
    }

    public void putShipment(Shipment shipment) {
        if(canAcceptShipment(shipment)) {
            this.shipment = shipment;
        }
    }

    public Shipment extractShipment() {
        Shipment extractedShipment = null;
        if(hasShipment()) {
            extractedShipment = shipment;
            shipment = null;
        }
        return extractedShipment;
    }

    public void turnMaintenanceMode() {
        if(!hasShipment()) {
            postCellStatus = PostCellStatus.AT_MAINTENANCE;
        }
    }

    public void turnWorkingMode() {
        postCellStatus = PostCellStatus.WORK;
    }

    public Shipment getShipment() {
        return shipment;
    }
}
