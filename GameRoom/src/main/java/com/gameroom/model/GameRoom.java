package com.gameroom.model;

import com.gameroom.controller.LocalManager;
import org.writet.Write;

import java.io.Serializable;
import java.util.ResourceBundle;

public class GameRoom implements Serializable {
    private SubjectsToBuy subjectsToBuy;
    private int amountOfOperation;
    private final ResourceBundle messages;

    public GameRoom(){
        this.messages = LocalManager.getMessage();
        this.amountOfOperation = 0;
        subjectsToBuy =new SubjectsToBuy();
    }

    public void addSubjectToBuy(SubjectToBuy subjectToBuy){
        subjectsToBuy.add(subjectToBuy);
        amountOfOperation++;
    }

    public String priceOfAllSubjects(){
        return subjectsToBuy.priceOfAll();
    }

    public String weightOfAllSubjects(){
        amountOfOperation++;
        return subjectsToBuy.weightOfAll();
    }
    public String subjectWithMaxPrice(){

        amountOfOperation++;
        return subjectsToBuy.maxPrice();
    }
    public String subjectWithMaxWeight(){

        amountOfOperation++;
        return subjectsToBuy.maxWeight();
    }
    public void sortByPrice(){
        amountOfOperation++;
        subjectsToBuy.sortByPrice();
    }
    public void sortByWeight(){
        amountOfOperation++;

        subjectsToBuy.sortByWeight();
    }
    public SubjectsToBuy allSubjects(){
        amountOfOperation++;

        return subjectsToBuy;
    }
    public String allSubjectsToFile(){
        Write writeToFile = new Write();
        return writeToFile.WriteToFile(allSubjects().toString());
    }
    public String searchByName(String name){
        amountOfOperation++;
        if(subjectsToBuy.searchByName(name)!=null)
            return subjectsToBuy.searchByName(name).toString();
        return messages.getString("search");
    }
    public String searchByPrice(String price){
        amountOfOperation++;

        if(subjectsToBuy.searchByPrice(price)!=null)
            return subjectsToBuy.searchByPrice(price).toString();
        return messages.getString("search");
    }
    public String getAmountOfOperation(){
        return messages.getString("getAmountOfOperation")+amountOfOperation;
    }

    public void clean() {
        this.amountOfOperation = 0;
        subjectsToBuy =new SubjectsToBuy();
    }
}
