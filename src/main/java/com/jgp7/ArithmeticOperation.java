package com.jgp7;

import com.jgp7.exception.DivisionByZeroException;
import com.jgp7.exception.ExitException;
import com.jgp7.helpers.ConsoleMessenger;
import com.jgp7.helpers.HelperMethods;

import java.util.List;

/**
 * Created by Evgeni Kuntsevich on 30.08.2016.
 */
public class ArithmeticOperation {
    private static List<Double> digits;

    public static double division() throws ExitException, DivisionByZeroException {
        ConsoleMessenger.writeMessage("You select division (for example: 3/2=1.5).");
        digits = HelperMethods.readTwoDigitsDivision();
        return digits.get(0) / digits.get(1);
    }

    public static double addition() throws ExitException {
        ConsoleMessenger.writeMessage("You select addition (for example: 3+2=5.0).");
        digits = HelperMethods.readTwoDigits();
        return digits.get(0) + digits.get(1);
    }

    public static double subtraction() throws ExitException {
        ConsoleMessenger.writeMessage("You select subtraction (for example: 3-2=1.0).");
        digits = HelperMethods.readTwoDigits();
        return digits.get(0) - digits.get(1);
    }

    public static double multiplication() throws ExitException {
        ConsoleMessenger.writeMessage("You select multiplication (for example: 3*2=6.0).");
        digits = HelperMethods.readTwoDigits();
        return digits.get(0) * digits.get(1);
    }

    public static double involution() throws ExitException {
        ConsoleMessenger.writeMessage("You select involution (for example: 3^2=9.0).");
        digits = HelperMethods.readTwoDigits();
        return Math.pow(digits.get(0), digits.get(1));
    }
}
