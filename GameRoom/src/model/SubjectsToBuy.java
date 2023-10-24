package model;

import java.util.ArrayList;
import java.util.List;

public class SubjectsToBuy {
    private final List<SubjectToBuy> subjectsToBuys;

    public SubjectsToBuy() {
        this.subjectsToBuys = new ArrayList<>();
    }


    public String priceOfAll(){
        int sum = 0;
        for (SubjectToBuy subjectToBuy: subjectsToBuys) {
            sum+=subjectToBuy.getPrice();
        }
        return "Цена всех вещей равна "+sum;
    }
    public String weightOfAll(){
        int sum = 0;
        for (SubjectToBuy subjectToBuy: subjectsToBuys) {
            sum+=subjectToBuy.getWeight();
        }
        return "Вес всех Вещей равен "+sum;
    }
    public String maxWeight(){
        SubjectToBuy maxSubjectToBuy = subjectsToBuys.get(subjectsToBuys.size()-1);
        for (SubjectToBuy subjectToBuy: subjectsToBuys) {
            if(maxSubjectToBuy.getWeight()<subjectToBuy.getWeight())
                maxSubjectToBuy=subjectToBuy;
        }
        return "Subject with max weight = "+maxSubjectToBuy;
    }
    public String maxPrice(){
        SubjectToBuy maxSubjectToBuy = subjectsToBuys.get(subjectsToBuys.size()-1);
        for (SubjectToBuy subjectToBuy: subjectsToBuys) {
            if(maxSubjectToBuy.getPrice()<subjectToBuy.getPrice())
                maxSubjectToBuy=subjectToBuy;
        }
        return "Subject with max price = "+maxSubjectToBuy;
    }
    public List<SubjectToBuy> getSubjectsToBuys() {
        return subjectsToBuys;
    }
    public SubjectToBuy get(int number) {
        return subjectsToBuys.get(number);
    }
    public void add(SubjectToBuy subjectToBuy) {
        this.subjectsToBuys.add(subjectToBuy);
    }
    public int size(){
        return subjectsToBuys.size();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (SubjectToBuy subjectsToBuy : subjectsToBuys)
            result.append(subjectsToBuy);
        return result.toString();
    }
}
