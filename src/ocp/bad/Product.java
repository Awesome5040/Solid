package ocp.bad;

public class Product {

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

    public String getTitle() {
        return title;
    }

    public ProductType getProductType() {
        return productType;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
