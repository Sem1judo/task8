package ua.com.foxminded.task_8.domain;

public class ObtainItem {
    private Goods goods;
    private int amount;

    public ObtainItem() {
    }

    public ObtainItem(Goods goods, int amount) {
        this.goods = goods;
        this.amount = amount;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "ObtainItem{" +
                "goods=" + goods +
                ", amount=" + amount +
                '}';
    }
}
