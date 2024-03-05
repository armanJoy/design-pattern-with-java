package com.nemo.adapter;

public class AdapterMain {
    public static void main(String[] args) {
        // Create an instance of the Adaptee
        Adaptee adaptee = new Adaptee();
        // Create an instance of the Adapter, passing the Adaptee instance to its constructor
        Target adapter = new Adapter(adaptee);
        // Call the request() method of the Target interface, which internally calls the specificRequest() method of the Adaptee
        adapter.request();
    }
}
