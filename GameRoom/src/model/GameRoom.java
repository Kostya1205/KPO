package model;

public class GameRoom {
    private final SubjectsToBuy subjectsToBuy;

    public GameRoom(){
        subjectsToBuy =new SubjectsToBuy();
    }

    public void addSubjectToBuy(SubjectToBuy subjectToBuy){
        subjectsToBuy.add(subjectToBuy);
    }
    public String priceOfAllSubjects(){
        return subjectsToBuy.priceOfAll();
    }

    public String weightOfAllSubjects(){
        return subjectsToBuy.weightOfAll();
    }
    public String subjectWithMaxPrice(){
        return subjectsToBuy.maxPrice();
    }
    public String subjectWithMaxWeight(){
        return subjectsToBuy.maxWeight();
    }
    public String allSubjects(){
        return subjectsToBuy.toString();
    }

}
