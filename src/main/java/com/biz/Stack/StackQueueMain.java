package com.biz.Stack;
import java.util.Scanner;

public class StackQueueMain {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Enter \n 1 to add element at the start  " +
                "\n choice: ");

        switch (sc.nextInt()) {
            case 1:
                Operation.addelement();
                break;


        }

    }
}