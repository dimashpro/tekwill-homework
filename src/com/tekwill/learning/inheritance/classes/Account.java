package com.tekwill.learning.inheritance.classes;

import java.util.Date;
import java.util.Objects;

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
        annualInterestRate = 0.0;
        dateCreated = new Date();
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

    @Override
    public String toString() {
         return "Account balance is: " + getBalance() +
                 "\nMonthly interest is: " + getMonthlyInterest() +
                 "\nCreated date is: " + getDateCreated();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                Double.compare(account.balance, balance) == 0 &&
                Double.compare(account.annualInterestRate, annualInterestRate) == 0 &&
                Objects.equals(dateCreated, account.dateCreated);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, balance, annualInterestRate, dateCreated);
    }
}
