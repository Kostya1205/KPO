package com.gameroom.view;

import com.gameroom.controller.SavedGameRoom;
import com.gameroom.model.GameRoom;

import java.io.*;

public class WriteSavedGameRoom {
    public static void  setGameRoom(GameRoom gameRoom) throws IOException {
        SavedGameRoom savedGame = new SavedGameRoom(gameRoom);
        //создаем 2 потока для сериализации объекта и сохранения его в файл
        FileOutputStream outputStream = new FileOutputStream("save.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        // сохраняем игру в файл
        objectOutputStream.writeObject(savedGame);
        //закрываем поток и освобождаем ресурсы
        objectOutputStream.close();
    }
    public static SavedGameRoom getGameRoom() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("save.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

       return (SavedGameRoom) objectInputStream.readObject();
    }
}
