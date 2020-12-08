package com.tekwill.learning.basics.nonaccesmodifiers.cooking;

public class Recipe {
    String title;
    String description;
    static String sourceUrl;
    public void update(){
        System.out.println("Updating");
    }
    public static void markAsCooked(){
        System.out.println("Cooooooked");
    }

    public Recipe(String title, String description) {
        this.title = title;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
