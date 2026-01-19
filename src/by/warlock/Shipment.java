package by.warlock;

import java.math.BigDecimal;

public record Shipment(Dimensions dimensions, BigDecimal weight, String description) {
}
