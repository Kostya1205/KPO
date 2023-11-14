package com.gameroom.model;

import com.gameroom.controller.GameMachine;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class SubjectsToBuyTest {
    @Test
    public void sortByPrice(){
        GameRoom room = new GameRoom();
        GameMachine gameMachine = new GameMachine();
        while(room.allSubjects().size()<10) gameMachine.buySubject(room);
        Comparator<SubjectToBuy> priceComparator = Comparator.comparingInt(SubjectToBuy::getPrice);
        List<SubjectToBuy> subjects = room.allSubjects().getAll();
        subjects.sort(priceComparator);
        // Сортируем список с использованием компаратора
        room.sortByPrice();
        for (int i = 0; i < subjects.size(); i++) {
            Assertions.assertEquals(subjects.get(i).getPrice(),room.allSubjects().get(i).getPrice());
        }
    }
    @Test
    public void sortByWeight(){
        GameRoom room = new GameRoom();
        GameMachine gameMachine = new GameMachine();
        while(room.allSubjects().size()<10) gameMachine.buySubject(room);
        Comparator<SubjectToBuy> weightComparator = Comparator.comparingInt(SubjectToBuy::getWeight);
        List<SubjectToBuy> subjects = room.allSubjects().getAll();
        subjects.sort(weightComparator);
        room.sortByWeight();
        for (int i = 0; i < subjects.size(); i++) {
            Assertions.assertEquals(subjects.get(i).getWeight(),room.allSubjects().get(i).getWeight());
        }
    }
    @Test
    public void searchByName(){
        GameRoom room = new GameRoom();
        GameMachine gameMachine = new GameMachine();
        while(room.allSubjects().size()<10) gameMachine.buySubject(room);
        for (SubjectToBuy subject : room.allSubjects().getAll()) {
            SubjectsToBuy subjectsToBuy2 = new SubjectsToBuy();
            List<SubjectToBuy> subjects = room.allSubjects().getAll();
            for (SubjectToBuy subjectToBuy : subjects)
                if (Objects.equals(subject.getName(), subjectToBuy.getName())) subjectsToBuy2.add(subjectToBuy);
            Assertions.assertEquals(subjectsToBuy2, room.allSubjects().searchByName(subject.getName()));
        }
    }
    @Test
    public void searchByPrice(){
        GameRoom room = new GameRoom();
        GameMachine gameMachine = new GameMachine();
        while(room.allSubjects().size()<10) gameMachine.buySubject(room);
        for (SubjectToBuy subject : room.allSubjects().getAll()) {
            SubjectsToBuy subjectsToBuy2 = new SubjectsToBuy();
            List<SubjectToBuy> subjects = room.allSubjects().getAll();
            for (SubjectToBuy subjectToBuy : subjects)
                if (subject.getPrice() == subjectToBuy.getPrice()) subjectsToBuy2.add(subjectToBuy);
            Assertions.assertEquals(subjectsToBuy2, room.allSubjects().searchByPrice(Integer.toString(subject.getPrice())));
        }
    }

    @Test
    public void priceOfAll(){
        for (int i = 0; i < 100; i++) {

            GameRoom room = new GameRoom();
            GameMachine gameMachine = new GameMachine();
            while (room.allSubjects().size() < 10) gameMachine.buySubject(room);

            int sum = 0;
            for (SubjectToBuy subjectToBuy : room.allSubjects().getAll()) {
                sum += subjectToBuy.getPrice();
            }
            Assertions.assertEquals("Цена всех вещей равна " + sum, room.allSubjects().priceOfAll());
        }
    }
    @Test
    public void weightOfAll(){
        for (int i = 0; i < 100; i++) {

            GameRoom room = new GameRoom();
            GameMachine gameMachine = new GameMachine();
            while (room.allSubjects().size() < 10) gameMachine.buySubject(room);

            int sum = 0;
            for (SubjectToBuy subjectToBuy : room.allSubjects().getAll()) {
                sum += subjectToBuy.getWeight();
            }
            Assertions.assertEquals("Вес всех Вещей равен " + sum, room.allSubjects().weightOfAll());
        }
    }
    @Test
    public void maxWeight(){
        for (int i = 0; i < 100; i++) {

            GameRoom room = new GameRoom();
            GameMachine gameMachine = new GameMachine();
            while (room.allSubjects().size() < 10) gameMachine.buySubject(room);

            SubjectToBuy maxSubjectToBuy = room.allSubjects().getAll().get(room.allSubjects().getAll().size() - 1);
            for (SubjectToBuy subjectToBuy : room.allSubjects().getAll()) {
                if (maxSubjectToBuy.getWeight() < subjectToBuy.getWeight())
                    maxSubjectToBuy = subjectToBuy;
            }
            Assertions.assertEquals("Subject with max weight = " + maxSubjectToBuy, room.allSubjects().maxWeight());
        }
    }
    @Test
    public void maxPrice(){
        for (int i = 0; i < 100; i++) {

            GameRoom room = new GameRoom();
            GameMachine gameMachine = new GameMachine();
            while (room.allSubjects().size() < 10) gameMachine.buySubject(room);

            SubjectToBuy maxSubjectToBuy = room.allSubjects().getAll().get(room.allSubjects().getAll().size() - 1);
            for (SubjectToBuy subjectToBuy : room.allSubjects().getAll()) {
                if (maxSubjectToBuy.getPrice() < subjectToBuy.getPrice())
                    maxSubjectToBuy = subjectToBuy;
            }
            Assertions.assertEquals("Subject with max price = " + maxSubjectToBuy, room.allSubjects().maxPrice());
        }
    }
}
