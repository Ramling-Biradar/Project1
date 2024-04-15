package com.tns.Abstraction;

abstract class Sim {
    private String simName;

    abstract void call();

    void show() {
        System.out.println("You are calling from " + simName + " sim");
        System.out.println("Have a good day");
    }

    void setSimName(String simName) {
        this.simName = simName;
    }
}
