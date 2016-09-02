package com.jgp7.helpers;

import com.jgp7.TypesArithmeticOperation;
import com.jgp7.exception.DivisionByZeroException;
import com.jgp7.exception.ExitException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Evgeni Kuntsevich on 02.09.2016.
 */
public class HelperMethods {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

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

        ConsoleMessenger.writeMessage("Enter first digit and press \"Enter\" after entered data.");

        while (true) {
            try {
                String inputString = HelperMethods.readString();
                digits.add(Double.valueOf(inputString));
                if (digits.size() == 2) break;
                ConsoleMessenger.writeMessage("Enter second digit and press \"Enter\" after entered data.");
            } catch (NumberFormatException e) {
                ConsoleMessenger.writeMessage("Error! You entered no digit. Try to repeat all again. Enter first digit and press \"Enter\" after entered data.");
                digits.clear();
            }
        }

        return digits;
    }

    public static List<Double> readTwoDigitsDivision() throws ExitException, DivisionByZeroException {
        List<Double> digits = new LinkedList();

        while (true) {
            try {
                ConsoleMessenger.writeMessage("Enter first digit and press \"Enter\" after entered data.");
                String inputString = HelperMethods.readString();
                digits.add(Double.valueOf(inputString));

                ConsoleMessenger.writeMessage("Enter second digit and press \"Enter\" after entered data.");
                inputString = HelperMethods.readString();

                if (Double.valueOf(inputString) == 0)
                    throw new DivisionByZeroException();
                else {
                    digits.add(Double.valueOf(inputString));
                    break;
                }
            } catch (NumberFormatException e) {
                ConsoleMessenger.writeMessage("Error! You entered no digit. Try to repeat all again.");
                digits.clear();
            }
        }

        return digits;
    }

    public static int getNumber() throws ExitException {
        return Integer.parseInt(HelperMethods.readString());
    }

    public static TypesArithmeticOperation getOperation(int i) {
        return TypesArithmeticOperation.values()[i - 1];
    }
}
