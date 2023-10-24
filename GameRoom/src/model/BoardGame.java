package model;

public class BoardGame extends SubjectToBuy{
    public BoardGame(int price, int weight, String name) {
        super(price,
                weight,
                name);
    }
    public BoardGame(int weight, String name) {
        super(weight, name);
    }

    public BoardGame(int price, int weight) {
        super(price, weight);
    }

    @Override
    public String getSubjectName() {
        return "BoardGame";
    }
}
