package com.company.java.introduction.ifelse;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        if (inputNumber % 2 != 0 || inputNumber >= 6 && inputNumber <= 20)
            System.out.println("Weird");
        else System.out.println("Not Weird");
    }

}
