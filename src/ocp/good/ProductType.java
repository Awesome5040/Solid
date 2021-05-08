package ocp.good;

public enum ProductType {
    FOOD(0.1), TECHNIC(0.2), CLOTHER(0.15);

    private double tax;

    ProductType(final double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }
}
