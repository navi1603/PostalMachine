package by.warlock;

import java.math.BigDecimal;

public record Dimensions(
        BigDecimal height,
        BigDecimal width,
        BigDecimal depth ) {
    public boolean canHold (Dimensions dimensions) {
        return this.height.compareTo(dimensions.height) >= 0 &&
                this.width.compareTo(dimensions.width) >= 0 &&
                this.depth.compareTo(dimensions.depth) >= 0;
    }
}
