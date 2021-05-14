package com.company;

public class Main {

    public static void main(String[] args) {
        rightTriangle(4);
        System.out.println("----------------------------");
        leftTriangle(4);
        System.out.println("----------------------------");
        pyramidTriangle(5);
        System.out.println("----------------------------");
        downwardRightTriangle(5);
        System.out.println("----------------------------");
        reversedPyramidTriangle(5);
    }

    public static void rightTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void downwardRightTriangle(int rows) {
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void leftTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 2 * (rows - i); j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void pyramidTriangle(int rows) {
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void reversedPyramidTriangle(int rows) {
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= rows - 1 - i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
