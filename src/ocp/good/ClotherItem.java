package ocp.good;

public class ClotherItem extends Product {

    public ClotherItem(String title, double price, int quantity) {
        super(title, ProductType.CLOTHER, price, quantity);
    }
}
