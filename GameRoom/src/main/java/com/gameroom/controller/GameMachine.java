package com.gameroom.controller;

import com.gameroom.model.*;

import java.util.Random;

public class GameMachine {
    private final SubjectsToBuy subjectsToBuy;
    public GameMachine(){
        subjectsToBuy = new SubjectsToBuy();
        subjectsToBuy.add(new Toy(1,200,"Sticker"));
        subjectsToBuy.add(new Toy(2,100,"Брелок"));
        subjectsToBuy.add(new Toy(2,1000,"Матрёшка"));
        subjectsToBuy.add(new Toy(3,400,"Car"));
        subjectsToBuy.add(new Toy(4,400,"Train"));
        subjectsToBuy.add(new Toy(5,200,"Солдатик"));

        subjectsToBuy.add(new BoardGame(5,1100,"Monopoly"));

        subjectsToBuy.add(new Furniture(15,200,"Table"));

    }
    public String buySubject(GameRoom gameRoom){
        Random random = new Random();
        SubjectToBuy subjectToBuy =subjectsToBuy.get(random.nextInt(subjectsToBuy.size()));
        gameRoom.addSubjectToBuy(subjectToBuy);
        return subjectToBuy+" add to GameRoom\n";
    }
    public String buySubjectHurd(GameRoom gameRoom){
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            text.append(buySubject(gameRoom));
        }
        return text.toString();
    }
}
