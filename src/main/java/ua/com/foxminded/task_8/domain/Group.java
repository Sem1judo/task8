package ua.com.foxminded.task_8.domain;

import java.util.List;

public class Group {
    private List<Group> children;
    private List<Goods> goods;

    public Group() {
    }

    public Group(List<Group> children, List<Goods> goods) {
        this.children = children;
        this.goods = goods;
    }

    public List<Group> getChildren() {
        return children;
    }

    public void setChildren(List<Group> children) {
        this.children = children;
    }

    public List<Goods> getGoods() {
        return goods;
    }

    public void setGoods(List<Goods> goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Group{" +
                "children=" + children +
                ", goods=" + goods +
                '}';
    }
}
