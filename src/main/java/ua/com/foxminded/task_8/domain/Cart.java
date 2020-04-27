package ua.com.foxminded.task_8.domain;

import java.util.List;

public class Cart {

    private List<ObtainItem> items;
    private Obtainer obtainer;

    public Cart() {
    }

    public Cart(List<ObtainItem> items, Obtainer obtainer) {
        this.items = items;
        this.obtainer = obtainer;
    }

    public List<ObtainItem> getItems() {
        return items;
    }

    public void setItems(List<ObtainItem> items) {
        this.items = items;
    }

    public Obtainer getObtainer() {
        return obtainer;
    }

    public void setObtainer(Obtainer obtainer) {
        this.obtainer = obtainer;
    }

    public void addItem(ObtainItem obtainItem) {
        items.add(obtainItem);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "items=" + items +
                ", obtainer=" + obtainer +
                '}';
    }
}
