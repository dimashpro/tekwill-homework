package com.tekwill.learning.inheritance.classes;

import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate = 0.0;
    private Date dateCreated;

    public Account() {
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, double balance, double annualInterestRate, Date dateCreated) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 12;
    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
    }

    public void deposit(double amount) {
        setBalance(getBalance() + amount);
    }

}
