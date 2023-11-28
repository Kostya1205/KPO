package com.gameroom.model;

import java.io.Serializable;
import java.util.Objects;

public class SubjectToBuy implements Serializable {
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

    @Override
    public String toString() {
        return " Type - "+getSubjectName()+" Name - "+getName()+" Weight - "+getWeight()+" Price - "+getPrice()+"\n";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectToBuy that = (SubjectToBuy) o;
        return price == that.price && weight == that.weight && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight, name);
    }
}
