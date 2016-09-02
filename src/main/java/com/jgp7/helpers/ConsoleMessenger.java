package com.jgp7.helpers;

/**
 * Created by Evgeni Kuntsevich on 30.08.2016.
 */
public class ConsoleMessenger {
    private static String operationItems = "\n1. addition (for example: 3+2=5.0); \n2. subtraction (for example: 3-2=1.0);\n3. multiplication (for example: 3*2=6.0); \n4. division (for example: 3/2=1.5);\n5. involution (for example: 3^2=9.0).";
    
    public static void writeMessage(String message) {
        System.out.println(message);
    }

    public static void welcomeMessage() {
        writeMessage("Hello. I'm Calculator and I can do next operation: " + operationItems +
                "\nEnter number of operation and press \"Enter\". Also if you want to interrupt your work enter \"exit\" in any time and press \"Enter\"");
    }

    public static void executeNextOperationMessage() {
        writeMessage("\nIf you want to execute one more operation, enter number of operation and press \"Enter\":" + operationItems +
                "\nAlso if you want to interrupt your work enter \"exit\" and press \"Enter\" ");
    }

    public static void divisionByZeroExceptionMessage() {
        writeMessage("Error! Division by zero. You can select operation again: " + operationItems +
                "\nEnter number of operation and press \"Enter\". Also if you want to interrupt your work enter \"exit\" and press \"Enter\"");
    }
}
