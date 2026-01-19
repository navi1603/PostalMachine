package by.warlock;

import java.math.BigDecimal;

public class PostCell {
    private final Dimensions dimensions;
    private PostCellStatus postCellStatus;
    private Shipment shipment;

    public PostCell(Dimensions dimensions) {
        this.dimensions = dimensions;
        this.postCellStatus = PostCellStatus.WORK;
    }

    public boolean hasShipment() {
        return (shipment != null);
    }

    public boolean canAcceptShipment(Shipment shipment) {
        if(hasShipment()) {
            return false;
        }
        if(postCellStatus != PostCellStatus.WORK) {
            return false;
        }
        return dimensions.canHold(shipment.dimensions());
    }

    public boolean putShipment(Shipment shipment) {
        if(!canAcceptShipment(shipment)) {
            System.out.println("Посылка не подходит по размерам ячейки " + this);
            return false;
        }
        this.shipment = shipment;
        return false;
    }

    public Shipment extractShipment() {
        Shipment extractedShipment = null;
        if(hasShipment()) {
            extractedShipment = this.shipment;
            this.shipment = null;
        }
        return extractedShipment;
    }

    public void turnMaintenanceMode() {
        if(!hasShipment()) {
            postCellStatus = PostCellStatus.AT_MAINTENANCE;
        } else {
            System.out.println("Невозможно поставить на обслуживание - в ячейке находится посылка.");
        }
    }

    public void turnWorkingMode() {
        postCellStatus = PostCellStatus.WORK;
    }

    public BigDecimal shipmentWeight() {
        return shipment.weight();
    }
}
