package ua.com.foxminded.task_8.domain;

public class Obtainer {
    private String name;

    public Obtainer() {
    }

    public Obtainer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Obtainer{" +
                "name='" + name + '\'' +
                '}';
    }
}
