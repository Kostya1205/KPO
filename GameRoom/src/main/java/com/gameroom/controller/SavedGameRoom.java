package com.gameroom.controller;

import com.gameroom.model.GameRoom;

import java.io.Serializable;

public class SavedGameRoom implements Serializable {
    private static final long serialVersionUID = 1L;
    private GameRoom gameRoom;

    public SavedGameRoom(GameRoom gameRoom) {
        this.gameRoom = gameRoom;
    }

    public GameRoom getGameRoom() {
        return gameRoom;
    }

    public void setGameRoom(GameRoom gameRoom) {
        this.gameRoom = gameRoom;
    }
}
