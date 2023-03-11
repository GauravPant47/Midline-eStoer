package User;

import Order.Cart;
import ProductDirectory.Product;

public class Seller extends User {
    private Cart cart;
    private Product[] ProductList;

    public Product[] getProductList() {
        return ProductList;
    }

    public void setProductList(Product[] productList) {
        ProductList = productList;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public Boolean verifyUser() {
        return true;
    }

}
