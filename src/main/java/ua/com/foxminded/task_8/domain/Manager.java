package ua.com.foxminded.task_8.domain;

import java.util.List;

public class Manager {
    private List<Cart> carts;

    public List<Cart> getCarts() {
        return carts;
    }

    public void setCarts(List<Cart> carts) {
        this.carts = carts;
    }

    public void addCart(Cart cart) {
        carts.add(cart);
    }


    @Override
    public String toString() {
        return "Manager{" +
                "carts=" + carts +
                '}';
    }
}
