package model;

public class Furniture extends SubjectToBuy{
    public Furniture(int price, int weight, String name) {
        super(price, weight, name);
    }

    public Furniture(int weight, String name) {
        super(weight, name);
    }


    public Furniture(int price, int weight) {
        super(price, weight);
    }

    @Override
    public String getSubjectName() {
        return "Furniture";
    }
}
