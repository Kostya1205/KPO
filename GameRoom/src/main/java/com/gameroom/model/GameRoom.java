package com.gameroom.model;

import com.mwrite.WriteToFile;

public class GameRoom {
    private final SubjectsToBuy subjectsToBuy;
    private int amountOfOperation;

    public GameRoom(){
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
        WriteToFile writeToFile = new WriteToFile("output.txt");
        return writeToFile.writeToFile(allSubjects().toString());
    }
    public String searchByName(String name){
        amountOfOperation++;
        if(subjectsToBuy.searchByName(name)!=null)
            return subjectsToBuy.searchByName(name).toString();
        return "No results";
    }
    public String searchByPrice(String price){
        amountOfOperation++;

        if(subjectsToBuy.searchByPrice(price)!=null)
            return subjectsToBuy.searchByPrice(price).toString();
        return "No results";
    }
    public String getAmountOfOperation(){
        return "Amount of operation = "+amountOfOperation;
    }
}
