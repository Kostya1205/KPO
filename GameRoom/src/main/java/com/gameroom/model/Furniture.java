package com.gameroom.model;

import com.gameroom.controller.LocalManager;

public class Furniture extends SubjectToBuy{
    public Furniture(int price, int weight, String name) {
        super(price, weight, name);
    }

    @Override
    public String getSubjectName() {
        return LocalManager.getMessage().getString("Furniture");
    }
}
