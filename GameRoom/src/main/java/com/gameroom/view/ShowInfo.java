package com.gameroom.view;


import com.gameroom.model.GameRoom;

public class ShowInfo {
    public ShowInfo(GameRoom gameRoom){
        System.out.println(gameRoom.priceOfAllSubjects());
        System.out.println(gameRoom.weightOfAllSubjects());
        System.out.println(gameRoom.subjectWithMaxPrice());
        System.out.println(gameRoom.subjectWithMaxWeight());
    }
}
