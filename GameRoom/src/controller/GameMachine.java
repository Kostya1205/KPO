package controller;

import model.*;

import java.util.Random;

public class GameMachine {
    private SubjectsToBuy subjectsToBuy;
    public GameMachine(){
        subjectsToBuy = new SubjectsToBuy();
        subjectsToBuy.add(new Toy(1,200,"Стикер"));
        subjectsToBuy.add(new Toy(2,100,"Брелок"));
        subjectsToBuy.add(new Toy(2,1000,"Матрёшка"));
        subjectsToBuy.add(new Toy(3,400,"Автомобиль"));
        subjectsToBuy.add(new Toy(4,400,"Поезд"));
        subjectsToBuy.add(new Toy(5,200,"Солдатик"));

        subjectsToBuy.add(new Events(10,200,"Мост"));

        subjectsToBuy.add(new BoardGame(5,1100,"Монополия"));

        subjectsToBuy.add(new Furniture(15,200,"Стол"));

    }
    public String buySubject(GameRoom gameRoom){
        Random random = new Random();
        SubjectToBuy subjectToBuy =subjectsToBuy.get(random.nextInt(subjectsToBuy.size()));
        gameRoom.addSubjectToBuy(subjectToBuy);
        return subjectToBuy.getSubjectName()+"  "+subjectToBuy.getName()+" добалена и игровую комнату";
    }
}
