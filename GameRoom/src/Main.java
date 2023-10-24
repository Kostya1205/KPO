import controller.Creator;
import view.ShowInfo;

public class Main {
    public static void main(String[] args) {
        new ShowInfo(Creator.createGameRoom());
    }
}