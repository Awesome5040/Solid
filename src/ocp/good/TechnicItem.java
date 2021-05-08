package ocp.good;

public class TechnicItem extends Product {

    public TechnicItem(String title, double price, int quantity) {
        super(title, ProductType.TECHNIC, price, quantity);
    }

}
