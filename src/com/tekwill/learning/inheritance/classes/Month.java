package com.tekwill.learning.inheritance.classes;

public class Month {
    private int monthNumber;

    public Month(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12)
            this.monthNumber = 1;
        else this.monthNumber = monthNumber;
    }

    public Month() {
        this.monthNumber = 1;
    }
}
