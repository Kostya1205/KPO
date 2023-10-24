package model;

public class SubjectToBuy {
    protected final int price;
    protected final int weight;
    protected final String name;

    public SubjectToBuy(int price, int weight, String name) {
        this.price = price;
        this.weight = weight;
        this.name = name;
    }

    public SubjectToBuy(int weight, String name) {
        this.weight = weight;
        this.name = name;
        this.price = 2;
    }

    public SubjectToBuy(int price, int weight) {
        this.price = price;
        this.weight = weight;
        this.name = "Kostya";

    }

    public int getPrice() {
        return price;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getSubjectName() {
        return name;
    }
}
