package com.tekwill.learning.inheritance.classes;

import java.util.Objects;

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

    public Month(String monthNumber) {
        switch (monthNumber){
            case "January":
                this.monthNumber = 1;
                break;
            case "February":
                this.monthNumber = 2;
                break;
            case "March":
                this.monthNumber = 3;
                break;
            case "April":
                this.monthNumber = 4;
                break;
            case "May":
                this.monthNumber = 5;
                break;
            case "June":
                this.monthNumber = 6;
                break;
            case "July":
                this.monthNumber = 7;
                break;
            case "August":
                this.monthNumber = 8;
                break;
            case "September":
                this.monthNumber = 9;
                break;
            case "October":
                this.monthNumber = 10;
                break;
            case "November":
                this.monthNumber = 11;
                break;
            default:
                this.monthNumber = 12;
                break;

        }
    }

    public void setMonthNumber(int monthNumber) {
        if (monthNumber < 1 || monthNumber > 12)
            this.monthNumber = 1;
        else this.monthNumber = monthNumber;    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {
        switch (getMonthNumber()){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return  "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            default:
                return "December";

        }
    }

    @Override
    public String toString() {
        return "Month{" +
                "monthNumber=" + monthNumber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Month month = (Month) o;
        return monthNumber == month.monthNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(monthNumber);
    }
}
