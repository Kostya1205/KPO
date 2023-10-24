package model;

public class GameRoom {
    private final SubjectsToBuy subjectsToBuy;

    public GameRoom(){
        subjectsToBuy =new SubjectsToBuy();
    }

    public void addSubjectToBuy(SubjectToBuy subjectToBuy){
        subjectsToBuy.add(subjectToBuy);
    }
    public String priceOfAllToys(){
        return subjectsToBuy.priceOfAll();
    }

    public String weightOfAllToys(){
        return subjectsToBuy.weightOfAll();
    }
    public String toyWithMaxPrice(){
        return subjectsToBuy.maxPrice();
    }
    public String toyWithMaxWeight(){
        return subjectsToBuy.maxWeight();
    }

}
