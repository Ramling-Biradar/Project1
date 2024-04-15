package com.tns.Abstraction;

class Bsnl extends Sim {
    private long mobNo;

    Bsnl(long mobNo) {
        this.mobNo = mobNo;
    }

    @Override
    void call() {
        setSimName("BSNL");
        details();
    }

    private void details() {
        System.out.println("Mobile Number is: " + mobNo);
    }
}

