package com.gameroom;

import com.gameroom.model.GameRoom;
import com.gameroom.view.ShowWindow;
import javafx.application.Application;
import javafx.stage.Stage;


public class GameRoomApplication extends Application {
    GameRoom gameRoom;
    @Override
    public void start(Stage primaryStage) {
        gameRoom = new GameRoom();
        new ShowWindow(gameRoom,primaryStage);
    }
    public static void main(String[] args) {
        launch();
    }
}