package model;

public class Events extends SubjectToBuy{
    public Events(int price, int weight, String name) {
        super(price, weight, name);
    }

    public Events(int weight, String name) {
        super(weight, name);
    }

    public Events(int price, int weight) {
        super(price, weight);
    }

    @Override
    public String getSubjectName() {
        return "Events";
    }
}
