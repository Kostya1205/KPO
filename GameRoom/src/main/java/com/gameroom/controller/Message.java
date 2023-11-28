package com.gameroom.controller;

import java.util.Locale;
import java.util.ResourceBundle;

public class Message {
    private static final String BUNDLE_NAME = "messages"; // без расширения .properties
    private static final ResourceBundle RESOURCE_BUNDLE;

    static {
        Locale locale = Locale.getDefault(); // или укажите язык явно, например, new Locale("en")
        RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, locale);
    }

    public static String getString(String key) {
        try {
            return RESOURCE_BUNDLE.getString(key);
        } catch (Exception e) {
            return '!' + key + '!';
        }
    }
}
