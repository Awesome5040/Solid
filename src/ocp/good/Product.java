package ocp.good;

public abstract class Product {

    private String title;
    private ProductType productType;
    private double price;
    private int quantity;

    public Product(String title, ProductType productType, double price, int quantity) {
        this.title = title;
        this.productType = productType;
        this.price = price;
        this.quantity = quantity;
    }

    public double getProductTotalPriceWithTax() {
        return price * quantity + price * quantity * productType.getTax();
    }

}
