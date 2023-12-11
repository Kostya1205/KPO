package com.gameroom.controller;

import javafx.beans.binding.Bindings;
import javafx.beans.binding.StringBinding;

import java.util.Locale;
import java.util.ResourceBundle;

public class LocalManager {
    private static Locale currentLocale = Locale.getDefault();

    public static Locale getCurrentLocale() {
        return currentLocale;
    }

    public static void setCurrentLocale(Locale locale) {
        currentLocale = locale;
    }
    public static String getMessage(String text){
        ResourceBundle bundle = ResourceBundle.getBundle("messages", currentLocale);
        try {
            return bundle.getString(text);
        } catch (Exception e) {
            System.err.println("Error retrieving message for key: " + text);
            e.printStackTrace();
            return "ERROR";
        }
    }
    public static StringBinding messageProperty(String key) {
        return Bindings.createStringBinding(() -> LocalManager.getMessage(key));
    }
}
