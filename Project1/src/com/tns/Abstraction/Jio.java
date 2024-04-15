package com.tns.Abstraction;

class Jio extends Sim {
    private long mobNo;

    Jio(long mobNo) {
        this.mobNo = mobNo;
    }

    @Override
    void call() {
        setSimName("Jio");
        details();
    }

    private void details() {
        System.out.println("Mobile Number is: " + mobNo);
    }
}
