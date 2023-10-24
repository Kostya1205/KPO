package model;

public class Toy extends SubjectToBuy{
    public Toy(int price, int weight, String name) {
        super(price, weight, name);
    }

    public Toy(int weight, String name) {
        super(weight, name);
    }

    public Toy(int price, int weight) {
        super(price, weight);
    }
    @Override
    public String getSubjectName() {
        return "Toy";
    }

}
