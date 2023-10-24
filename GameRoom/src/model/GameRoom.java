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
    public void sortByPrice(){
        subjectsToBuy.sortByPrice();
    }
    public void sortByWeight(){
        subjectsToBuy.sortByWeight();
    }
    public String allSubjects(){
        return subjectsToBuy.toString();
    }
    public String searchByName(String name){
        SubjectToBuy subjectToBuy1 = subjectsToBuy.searchByName(name);
        if(subjectToBuy1!=null)
            return subjectToBuy1.toString();
        return "No results";
    }
    public String searchByPrice(String price){
        SubjectToBuy subjectToBuy1 = subjectsToBuy.searchByPrice(price);
        if(subjectToBuy1!=null)
            return subjectToBuy1.toString();
        return "No results";
    }
}
