package ocp.bad;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class ShoppingCartService {

    public double getCartTotalWithTaxes(final List<Product> products) {
        AtomicReference<Double> totalPrice = new AtomicReference<>(0.00);
        products.forEach(product -> {
            double productTax = 0;
            ProductType productType = product.getProductType();
            if (productType.equals(ProductType.CLOTHERS))
                productTax = 0.15;
            else if (productType.equals(ProductType.FOOD))
                productTax = 0.1;
            else if (productType.equals(ProductType.TECHNICS))
                productTax = 0.2;
            else throw new ProjectRuntimeException("Unsupported product type");
            totalPrice.set(totalPrice.get() + product.getPrice() * product.getQuantity() * productTax + product.getPrice()
                    * product.getQuantity());
        });
        return totalPrice.get();
    }
}
