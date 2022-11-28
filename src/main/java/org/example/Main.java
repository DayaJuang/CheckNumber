package org.example;

public class Main {
    public static void main(String[] args) {
        checkNumber(12);
    }

    public static void checkNumber(int number){
        String ans;
        if(number == 0){
            ans = "zero";
            System.out.println(ans);
            return;
        }

        ans = (number > 0) ? "positive" : "negative";

        System.out.println(ans);
    }
}