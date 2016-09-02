package com.jgp7.helpers;

import com.jgp7.calculator.TypesArithmeticOperation;
import com.jgp7.exception.DivisionByZeroException;
import com.jgp7.exception.EnterNoNumberOperationException;
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
            if (inputString.equalsIgnoreCase("e")) throw new ExitException();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return inputString;
    }

    public static List<Double> readTwoDigits() throws ExitException {
        List<Double> digits = new LinkedList();

        ConsoleMessenger.enterFirstDigitMessage();

        while (true) {
            try {
                String inputString = HelperMethods.readString();
                digits.add(Double.valueOf(inputString));
                if (digits.size() == 2) break;
                ConsoleMessenger.enterSecondDigitMessage();
            } catch (NumberFormatException e) {
                ConsoleMessenger.repeatAgainMessage();
                digits.clear();
            }
        }

        return digits;
    }

    public static List<Double> readTwoDigitsDivision() throws ExitException, DivisionByZeroException {
        List<Double> digits = new LinkedList();

        while (true) {
            try {
                ConsoleMessenger.enterFirstDigitMessage();
                String inputString = HelperMethods.readString();
                digits.add(Double.valueOf(inputString));

                ConsoleMessenger.enterSecondDigitMessage();
                inputString = HelperMethods.readString();

                if (Double.valueOf(inputString) == 0)
                    throw new DivisionByZeroException();
                else {
                    digits.add(Double.valueOf(inputString));
                    break;
                }
            } catch (NumberFormatException e) {
                ConsoleMessenger.repeatAgainMessage();
                digits.clear();
            }
        }

        return digits;
    }

    public static int getNumber() throws ExitException {
        return Integer.parseInt(HelperMethods.readString());
    }

    public static TypesArithmeticOperation getOperation(int i) throws EnterNoNumberOperationException {
        if (i <= TypesArithmeticOperation.values().length)
            return TypesArithmeticOperation.values()[i - 1];
        else throw new EnterNoNumberOperationException();
    }

    public static void sleep(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
