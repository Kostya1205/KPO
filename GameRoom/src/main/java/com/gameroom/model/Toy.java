package com.gameroom.model;

import com.gameroom.controller.LocalManager;

public class Toy extends SubjectToBuy{
    public Toy(int price, int weight, String name) {
        super(price, weight, name);
    }

    @Override
    public String getSubjectName() {
        return LocalManager.getMessage("Toy");
    }

}
