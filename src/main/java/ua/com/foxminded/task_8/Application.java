package ua.com.foxminded.task_8;

import ua.com.foxminded.task_8.domain.*;

public class Application {

    public static void main(String[] args) {

        Obtainer obtainer = new Obtainer("SomeObtainer");

        Goods goods = new Goods(500, "someProduct");

        ObtainItem obtainItem = new ObtainItem(goods, 5);

        WarehouseManager warehouseManager = new WarehouseManager();
        warehouseManager.getCatalog();

        Cart cart = new Cart();
        cart.getObtainer();
        cart.addItem(obtainItem);

        Manager manager = new Manager();
        manager.addCart(cart);

    }
}
