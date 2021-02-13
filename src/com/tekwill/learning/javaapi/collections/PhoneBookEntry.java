package com.tekwill.learning.javaapi.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PhoneBookEntry {
    private String personName;
    private String phoneNumber;

    public PhoneBookEntry() {
    }

    public PhoneBookEntry(String personName, String phoneNumber) {
        this.personName = personName;
        this.phoneNumber = phoneNumber;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personsName) {
        this.personName = personsName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public void run(){
        Scanner scanner = new Scanner(System.in);
        List<PhoneBookEntry> phoneBookEntryList = new ArrayList<>();

        System.out.println("How many new persons you want to add in PhoneBook? ");
        int persons = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < persons; i++) {

            System.out.println("Enter the name :");
            String personName = scanner.nextLine();
            System.out.println("Enter the phone number :");
            String phoneNumber = scanner.nextLine();
            PhoneBookEntry phoneBookEntry = new PhoneBookEntry(personName, phoneNumber);
            phoneBookEntryList.add(phoneBookEntry);
        }

        System.out.println("List with all names and phone numbers :");
        for (PhoneBookEntry phoneBookEntry : phoneBookEntryList) {
            System.out.println(phoneBookEntry);
        }
    }  @Override
    public String toString() {
        return "PhoneBookEntry{" +
                "personName='" + personName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBookEntry that = (PhoneBookEntry) o;
        return Objects.equals(personName, that.personName) &&
                Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personName, phoneNumber);
    }
}
