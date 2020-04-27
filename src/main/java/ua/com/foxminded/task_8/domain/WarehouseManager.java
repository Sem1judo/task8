package ua.com.foxminded.task_8.domain;

public class WarehouseManager {
    private Group root;

    public Group getRoot() {
        return root;
    }

    public void setRoot(Group root) {
        this.root = root;
    }

    public void obtainGoods(Goods goods, int amount) {

    }

    public Group getCatalog() {
        return root;
    }

    @Override
    public String toString() {
        return "WarehouseManager{" +
                "root=" + root +
                '}';
    }
}
