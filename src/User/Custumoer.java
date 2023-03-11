package User;

import Order.Cart;

public class Custumoer extends User {
	private Cart cart;

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
