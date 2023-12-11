package com.gameroom;

import com.gameroom.model.GameRoom;
import com.gameroom.view.ShowWindow;
import com.gameroom.view.WriteSavedGameRoom;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class GameRoomApplicationSecond extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            new ShowWindow(WriteSavedGameRoom.getGameRoom().getGameRoom(),primaryStage);
        } catch (IOException | ClassNotFoundException e) {
            new ShowWindow(new GameRoom(),primaryStage);
        }
    }
    public static void main(String[] args) {
        launch();
    }
}