package com.tekwill.learning.io.formatting;

public class FormattingParameters {
    public static void main(String[] args){
        int totalTaxRevenue1 = 336047;
        int property1 = -53353;
        int income1 = 23000;
        double sales1 = 93399.55;
        int totalTaxRevenue2 = 24247;
        int property2 = 4253;
        int income2 = 240050;
        double sales2 = 932499.77;
        int property3 = -353;
        int income3 = 232420;
        double sales3 = 932449.88;
        String s1 = "Seasonally Adjusted"   ;
        String s2 = "Not seasonally adjusted";
        String s3 = "Performance Measures";
        String s4 = "Total Tax Revenue";
        String s5 = "Property";
        String s6 = "Income";
        String s7 = "Sales";
        String s8 = "(na)";
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("||                           %-56s",s1);
        System.out.printf("||                           %-56s",s2);
        System.out.printf("||                      %-40s||",s3);
        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("||%-20s",s4);
        System.out.printf("|%-20s",s5);
        System.out.printf("|%-20s",s6);
        System.out.printf("|%-20s",s7);
        System.out.printf("||%-20s",s4);
        System.out.printf("|%-20s",s5);
        System.out.printf("|%-20s",s6);
        System.out.printf("|%-20s",s7);
        System.out.printf("||%-20s",s5);
        System.out.printf("|%-20s",s6);
        System.out.printf("|%-20s",s7);
        System.out.println("||");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("||%-20s",s8);
        System.out.printf("|%-20s",s8);
        System.out.printf("|%-20s",s8);
        System.out.printf("|%-20s",s8);
        System.out.printf("||%-20s",s8);
        System.out.printf("|%-20s",s8);
        System.out.printf("|%-20s",s8);
        System.out.printf("|%-20s",s8);
        System.out.printf("||%-20s",s8);
        System.out.printf("|%-20s",s8);
        System.out.printf("|%-20s",s8);
        System.out.println("||");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("||%," +
                "" +
                "" +
                "" +
                "" +
                "" +
                "" +
                "20d",totalTaxRevenue1);
        System.out.printf("|%20d",property1);
        System.out.printf("|%20d",income1);
        System.out.printf("|%20f",sales1);
        System.out.printf("||%20d",totalTaxRevenue2);
        System.out.printf("|%20d",property2);
        System.out.printf("|%20d",income2);
        System.out.printf("|%20f",sales2);
        System.out.printf("||%20d",property3);
        System.out.printf("|%20d",income3);
        System.out.printf("|%20f",sales3);
        System.out.println("||");
        System.out.printf("||%20d",totalTaxRevenue1);
        System.out.printf("|%20d",property1);
        System.out.printf("|%20d",income1);
        System.out.printf("|%20f",sales1);
        System.out.printf("||%20d",totalTaxRevenue2);
        System.out.printf("|%20d",property2);
        System.out.printf("|%20d",income2);
        System.out.printf("|%20f",sales2);
        System.out.printf("||%20d",property3);
        System.out.printf("|%20d",income3);
        System.out.printf("|%20f",sales3);
        System.out.println("||");
        System.out.printf("||%20d",totalTaxRevenue1);
        System.out.printf("|%20d",property1);
        System.out.printf("|%20d",income1);
        System.out.printf("|%20f",sales1);
        System.out.printf("||%20d",totalTaxRevenue2);
        System.out.printf("|%20d",property2);
        System.out.printf("|%20d",income2);
        System.out.printf("|%20.4f",sales2);
        System.out.printf("||%20d",property3);
        System.out.printf("|%20d",income3);
        System.out.printf("|%20f",sales3);
        System.out.println("||");
        System.out.printf("||%20d",totalTaxRevenue1);
        System.out.printf("|%20d",property1);
        System.out.printf("|%,20d",income1);
        System.out.printf("|%20.3f",sales1);
        System.out.printf("||%20d",totalTaxRevenue2);
        System.out.printf("|%20d",property2);
        System.out.printf("|%020d",income2);
        System.out.printf("|%20f",sales2);
        System.out.printf("||%20d",property3);
        System.out.printf("|%20d",income3);
        System.out.printf("|%20f",sales3);
        System.out.println("||");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


    }
}
