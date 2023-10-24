package controller;

import model.GameRoom;

public class Creator {
    public static GameRoom createGameRoom(){
        GameRoom gameRoom = new GameRoom();
        GameMachine toyMachine = new GameMachine();
        for (int i = 0; i < 30; i++)
            System.out.println(toyMachine.buySubject(gameRoom));
        return gameRoom;
    }
}
