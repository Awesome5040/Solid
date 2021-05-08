package ocp.good.impl;

import ocp.good.Product;
import ocp.good.interfaces.IShoppingCartService;

import java.util.List;

public class ShoppingCartService implements IShoppingCartService {
    @Override
    public double getCartTotalWithTaxes(final List<Product> products) {
        return products.stream().mapToDouble(Product::getProductTotalPriceWithTax).sum();
    }
}
