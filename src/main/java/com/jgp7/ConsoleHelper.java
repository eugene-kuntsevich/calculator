package com.jgp7;

import com.jgp7.exception.DivisionByZeroException;
import com.jgp7.exception.ExitException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Evgeni Kuntsevich on 30.08.2016.
 */
public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static String operationItems = "\n1. addition (for example: 3+2=5.0); \n2. subtraction (for example: 3-2=1.0);\n3. multiplication (for example: 3*2=6.0); \n4. division (for example: 3/2=1.5);\n5. involution (for example: 3^2=9.0).";

    public static String readString() throws ExitException {
        String inputString = "";

        try {
            inputString = reader.readLine();
            if (inputString.equalsIgnoreCase("exit")) throw new ExitException();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return inputString;
    }

    public static List<Double> readTwoDigits() throws ExitException {
        List<Double> digits = new LinkedList();

        ConsoleHelper.writeMessage("Enter first digit and press \"Enter\" after entered data.");

        while (true) {
            try {
                String inputString = ConsoleHelper.readString();
                digits.add(Double.valueOf(inputString));
                if (digits.size() == 2) break;
                ConsoleHelper.writeMessage("Enter second digit and press \"Enter\" after entered data.");
            } catch (NumberFormatException e) {
                ConsoleHelper.writeMessage("Error! You entered no digit. Try to repeat all again. Enter first digit and press \"Enter\" after entered data.");
                digits.clear();
            }
        }

        return digits;
    }

    public static List<Double> readTwoDigitsDivision() throws ExitException, DivisionByZeroException {
        List<Double> digits = new LinkedList();

        while (true) {
            try {
                ConsoleHelper.writeMessage("Enter first digit and press \"Enter\" after entered data.");
                String inputString = ConsoleHelper.readString();
                digits.add(Double.valueOf(inputString));

                ConsoleHelper.writeMessage("Enter second digit and press \"Enter\" after entered data.");
                inputString = ConsoleHelper.readString();

                if (Double.valueOf(inputString) == 0) throw new DivisionByZeroException();
                else {
                    digits.add(Double.valueOf(inputString));
                    break;
                }
            } catch (NumberFormatException e) {
                ConsoleHelper.writeMessage("Error! You entered no digit. Try to repeat all again.");
                digits.clear();
            }
        }

        return digits;
    }

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
