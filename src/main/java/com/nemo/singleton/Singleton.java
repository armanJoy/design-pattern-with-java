package com.nemo.singleton;

public class Singleton {
    // Private static variable to hold the single instance of the class
    private static Singleton instance;

    private String title;

    // Private constructor to prevent instantiation from outside
    private Singleton() {
        // Constructor logic (if any)
        this.title = "Hello, I am a singleton instance!";
    }

    // Public static method to get the single instance of the class
    public static Singleton getInstance() {
        // Lazy initialization: create the instance only if it doesn't exist
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Example method of the singleton class
    public void showMessage() {
        System.out.println(this.title);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
