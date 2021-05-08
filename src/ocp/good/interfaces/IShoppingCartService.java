package ocp.good.interfaces;

import ocp.good.Product;

import java.util.List;

public interface IShoppingCartService {

    double getCartTotalWithTaxes(final List<Product> products);
}
