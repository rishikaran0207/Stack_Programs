package com.biz.Stack;
import java.util.Scanner;

public class StackQueueMain {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter \n 1 to add element at the start  " + " \n 2 to show the peek element" + "\n 3 to pop all element" + "\n 4 to queue the element" + "\n 5 to dequeue the element" + "\n choice: ");

        switch (sc.nextInt()) {
            case 1:
                Operation.addelement();
                break;
            case 2:
                Operation.peek();
                break;

            case 3:
                Operation.poptillempty();
                break;
            case 4:
                Operation.queueelement();
                break;
            case 5:
                Operation.dequeueelement();
                break;

        }
    }
}

