package com.nemo.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton = Singleton.getInstance();
        // Call a method on the singleton instance
        singleton.showMessage();
        singleton.setTitle("New Title of Singleton!");
        checkSingletonAfterUpdate();
    }

    public static void checkSingletonAfterUpdate() {
        // Get the singleton instance
        Singleton singleton = Singleton.getInstance();
        // Call a method on the singleton instance
        singleton.showMessage();
    }
}
