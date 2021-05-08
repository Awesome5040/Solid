package ocp.good;

public class FoodItem extends Product{

    public FoodItem(String title, double price, int quantity) {
        super(title, ProductType.FOOD, price, quantity);
    }
}
