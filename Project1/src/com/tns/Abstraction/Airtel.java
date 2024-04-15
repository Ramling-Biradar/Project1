package com.tns.Abstraction;

class Airtel extends Sim {
    private long mobNo;

    Airtel(long mobNo) {
        this.mobNo = mobNo;
    }

    @Override
    void call() {
        setSimName("Airtel");
        details();
    }

    private void details() {
        System.out.println("Mobile Number is: " + mobNo);
    }
}