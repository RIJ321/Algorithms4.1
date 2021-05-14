package com.company;

import java.util.Scanner;

public class Name {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i = 0; i < rows + 1; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        for (int i = 0; i < rows; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            System.out.print("*");

            for (int j = 0; j <= i * 2; j++) {
                System.out.print(" ");
            }

            System.out.print("*");
            System.out.println();
        }

        for (int q = 0; q < rows * 2 + 1; q++) {
            System.out.print("*");
        }
      /*for (int r = rows; r >= 0; r--) {
            for (int e = rows - r; e > 0; e--) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int e = 0; e <= r; e++) {
                System.out.print(" ");
            }
            System.out.println();
        }*/


    }

}
