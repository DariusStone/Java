package Lesson1;

import java.util.Scanner;

public class HomeWorkApp {
    public static void main(String[] args) {
        /*System.out.println(" Orange,\n Banana,\n Apple");*/
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    private static void compareNumbers() {
        int a = 1;
        int b = 22;
        if (a >= b) {
            System.out.println("a >= b");} else if (a < b) {
            System.out.println("a < b");}
            
        }


    static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }
    static void checkSumSign() {
        int varA = -9;
        int varB = 6;
        System.out.println(varA + varB);
        if (varA + varB >= 0) {
            System.out.println("Сумма положительная");
        } else if ((varA + varB) < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    static void printColor() {
       int value = 101;
       if (value <= 0) {
           System.out.println("Red");
       } else if (value > 0 && value <= 100) {
           System.out.println("Yellow");
           
       } else if (value > 100) {
           System.out.println("Green");
           
       }

    }
}
