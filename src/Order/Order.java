package Order;

import User.Custumoer;

public class Order {
    private String orderId;
    private Custumoer user;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Custumoer getUser() {
        return user;
    }

    public void setUser(Custumoer user) {
        this.user = user;
    }

}
