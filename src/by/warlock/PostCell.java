package by.warlock;

public class PostCell {
    private Dimensions dimensions;
    private ShipmentStatus shipmentStatus;
    private Shipment shipment;

    public PostCell(Dimensions dimensions, ShipmentStatus shipmentStatus) {
        this.dimensions = dimensions;
        this.shipmentStatus = shipmentStatus;
    }

    public boolean hasShipment() {
        return (shipment == null) ? false : true;
    }

    public boolean canAcceptShipment(Shipment shipment) {
        if(this.shipment == null &&
                shipmentStatus == ShipmentStatus.WORK &&
                dimensions.length() > shipment.dimensions().length() &&
                dimensions.depth() > shipment.dimensions().depth() &&
                dimensions.width() > shipment.dimensions().width()) {
            return true;
        }
        return false;
    }

    public int putShipment(Shipment shipment) {
        if(canAcceptShipment(shipment)) {
            this.shipment = shipment;
        }
        return 0;
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
            shipmentStatus = ShipmentStatus.AT_MAINTENANCE;
        }
    }

    public void turnWorkingMode() {
        shipmentStatus = ShipmentStatus.WORK;
    }

    public Shipment getShipment() {
        return shipment;
    }
}
