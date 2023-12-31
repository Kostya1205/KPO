package com.gameroom.model;

import com.gameroom.controller.LocalManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.Serializable;
import java.util.*;

public class SubjectsToBuy implements Serializable {

    private final List<SubjectToBuy> subjectsToBuys;
    private static final Logger logger = LogManager.getLogger(SubjectsToBuy.class);
    public SubjectsToBuy() {
        this.subjectsToBuys = new ArrayList<>();
    }

    public void sortByPrice(){
        Comparator<SubjectToBuy> priceComparator = Comparator.comparingInt(SubjectToBuy::getPrice);
        // Сортируем список с использованием компаратора
        subjectsToBuys.sort(priceComparator);
    }
    public void sortByWeight(){
        Comparator<SubjectToBuy> priceComparator = Comparator.comparingInt(SubjectToBuy::getWeight);
        // Сортируем список с использованием компаратора
        subjectsToBuys.sort(priceComparator);
    }
    public SubjectsToBuy searchByName(String name){
        SubjectsToBuy subjectsToBuy2 = new SubjectsToBuy();
        for (SubjectToBuy subjectToBuy: subjectsToBuys) {
            if (Objects.equals(name, subjectToBuy.getName()))  subjectsToBuy2.add(subjectToBuy);
        }
        return subjectsToBuy2;
    }
    public SubjectsToBuy searchByPrice(String price){
        SubjectsToBuy subjectsToBuy2 = new SubjectsToBuy();
        for (SubjectToBuy subjectToBuy: subjectsToBuys) {
            if (Integer.parseInt(price)==subjectToBuy.getPrice()) subjectsToBuy2.add(subjectToBuy);
        }
        return subjectsToBuy2;
    }
    public String priceOfAll(){
        try {
            if (subjectsToBuys.isEmpty())
                throw new Exception(LocalManager.getMessage("arrayEmpty"));
            int sum = 0;
            for (SubjectToBuy subjectToBuy : subjectsToBuys) {
                sum += subjectToBuy.getPrice();
            }
            return LocalManager.getMessage("priceOfAllsubj") + sum;
        }
        catch (Exception e){
            logger.error("Array",e);
            return LocalManager.getMessage("PleaseAddSubject");
        }
    }
    public String weightOfAll(){
        try {
            if (subjectsToBuys.isEmpty())
                throw new Exception(LocalManager.getMessage("arrayEmpty"));
        int sum = 0;
        for (SubjectToBuy subjectToBuy: subjectsToBuys) {
            sum+=subjectToBuy.getWeight();
        }
        return "Вес всех Вещей равен "+sum;
        }
        catch (Exception e){
            logger.error("Array",e);
            return LocalManager.getMessage("PleaseAddSubject");
        }
    }
    public String maxWeight(){
        try {
            if (subjectsToBuys.isEmpty())
                throw new Exception(LocalManager.getMessage("arrayEmpty"));
        SubjectToBuy maxSubjectToBuy = subjectsToBuys.get(subjectsToBuys.size()-1);
        for (SubjectToBuy subjectToBuy: subjectsToBuys) {
            if(maxSubjectToBuy.getWeight()<subjectToBuy.getWeight())
                maxSubjectToBuy=subjectToBuy;
        }
        return LocalManager.getMessage("SubjWithMaxWeight")+maxSubjectToBuy;
        }
        catch (Exception e){
            logger.error("Array",e);
            return LocalManager.getMessage("PleaseAddSubject");
        }
    }
    public String maxPrice(){
        try {
            if (subjectsToBuys.isEmpty())
                throw new Exception(LocalManager.getMessage("arrayEmpty"));
            SubjectToBuy maxSubjectToBuy = subjectsToBuys.get(subjectsToBuys.size() - 1);
            for (SubjectToBuy subjectToBuy : subjectsToBuys) {
                if (maxSubjectToBuy.getPrice() < subjectToBuy.getPrice())
                    maxSubjectToBuy = subjectToBuy;
            }
            return LocalManager.getMessage("SubjWithMaxPrice") + maxSubjectToBuy;
        }catch (Exception e)
        {
            logger.error("Array", e);
            return LocalManager.getMessage("PleaseAddSubject");
        }
    }
    public SubjectToBuy get(int number) {
        return subjectsToBuys.get(number);
    }
    public List<SubjectToBuy> getAll() {
        return subjectsToBuys;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubjectsToBuy that = (SubjectsToBuy) o;
        return Objects.equals(subjectsToBuys, that.subjectsToBuys);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectsToBuys);
    }
}
