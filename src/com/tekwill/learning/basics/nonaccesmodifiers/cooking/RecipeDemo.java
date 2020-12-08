package com.tekwill.learning.basics.nonaccesmodifiers.cooking;

import static com.tekwill.learning.basics.nonaccesmodifiers.cooking.Recipe.markAsCooked;
import static com.tekwill.learning.basics.nonaccesmodifiers.cooking.Recipe.sourceUrl;

public class RecipeDemo {
    public static void main(String[] args){
       Recipe r1 = new Recipe("mamaliga","corn flour cooked in a cauldron");
       Recipe r2 = new Recipe("cake", "flour with sugar, with apple, baked in the oven");
       sourceUrl = "www.kuhnea.md";
       System.out.println(r1);
       System.out.println(r2);
       System.out.println(sourceUrl);
       r2.update();
       markAsCooked();


    }
}
