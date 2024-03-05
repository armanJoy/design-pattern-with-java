package com.nemo.adapter;

public class Adapter implements Target{

    private Adaptee adaptee;

    Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        // implement required adaptation or business logic here
        adaptee.genericRequest();
    }
}
