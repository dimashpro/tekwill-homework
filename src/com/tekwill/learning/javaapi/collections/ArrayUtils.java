package com.tekwill.learning.javaapi.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

public class ArrayUtils {
    public static List<String> colorList = new ArrayList<>();

    public static void main(String[] args) {

        //  1  print out the collection
        colorList.add("Red");
        colorList.add("Green");
        colorList.add("Orange");
        colorList.add("Blue");
        colorList.add("Yellow");
        System.out.println(colorList);

        //  2   solution to iterate through all elements
        ListIterator<String> colorListIterator = colorList.listIterator();
        insertElementAtFirstPosition("White");
        System.out.println(colorList);
    }

    //  3
    public static void insertElementAtFirstPosition(String color) {
        colorList.add(0, color);
    }

    //   4
    public static String retrieveElement(int index) {
        return colorList.get(index);
    }

    //   5
    public static void updateElement(int index, String color) {
        colorList.set(index, color);
    }

    //   6
    public static void removeThird() {
        colorList.remove(2);
    }

    //   7
    public static boolean searchElement(String color) {
        return colorList.contains(color);
    }

    //   8
    public static void copyOneArrayListInAnother(ArrayList<String> arrList) {
        colorList.replaceAll((UnaryOperator<String>) arrList);

    }

    //   9
    public static void reverseElements(ArrayList<String> arrayList) {
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
    }

    //   10
    public static List<String> extractPortion(int fromIndex, int toIndex) {
        return colorList.subList(fromIndex, toIndex);
    }

    //   11
    public static void swapElements(int index1, int index2) {
        String temp = colorList.get(index1);
        colorList.set(index1, colorList.get(index2));
        colorList.set(index2, temp);
    }

    //   12
    public static void joinArray(ArrayList<String> arrList){

        colorList.addAll(arrList);

    }

    //   13
    public static void toEmptyArray(){
        colorList.clear();
    }

    //   14
    public static boolean isEmptyArrayList(){
        return colorList.isEmpty();
    }
}
