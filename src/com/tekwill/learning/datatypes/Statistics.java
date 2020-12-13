package com.tekwill.learning.datatypes;

public class Statistics {
    long currentWorldPopulation = 7831436009L;
    double rateOfGrowing = 1.05;
    String source1 = "World Population Prospect the 2019 Revision.";
    String source2 = "International Program Center at the U.S. Census Bureau, Population Division.";

    public static void main(String[] args){
        Statistics statistics = new Statistics();
        System.out.println("Current World Population is "+statistics.currentWorldPopulation);
        System.out.println("World population is currently (2020) growing at a rate of around "+statistics.rateOfGrowing+" % per year.");
        System.out.println("Sources for the world population counter:\n*"+ statistics.source1+"\n*"+statistics.source2);
    }
}
