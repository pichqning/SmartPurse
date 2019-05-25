package SSD.SmartPurse;

/**
 * This class is all currency in application convert to usdollar before convert to another
 * such as yen>dollar , dollar > thai
 */

public enum Currency {
    dollar(1.00),
    yen(0.0091),
    won(0.00084),
    baht(0.031),
    yuan(0.14),
    pound(1.27)
    ;

    /**
     * Enum attribute
    * */

    private final double value;
    private Currency( double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }


}
