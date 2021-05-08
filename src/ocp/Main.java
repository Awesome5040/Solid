package ocp;

import ocp.good.Product;
import ocp.good.impl.ShoppingCartService;
import ocp.good.ClotherItem;
import ocp.good.FoodItem;
import ocp.good.interfaces.IShoppingCartService;
import ocp.good.TechnicItem;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new ClotherItem("T-Shirt", 10.00, 2));
        products.add(new TechnicItem("Iphone12", 1000.00, 1));
        products.add(new FoodItem("Doshirak", 1.00, 30));
        IShoppingCartService shoppintCartService = new ShoppingCartService();
        System.out.println(shoppintCartService.getCartTotalWithTaxes(products));
    }
}
