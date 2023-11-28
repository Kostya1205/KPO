package com.gameroom.controller;

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
    public static ResourceBundle getMessage(){
        return ResourceBundle.getBundle("messages", currentLocale);
    }
}
