package com.jgp7;

import com.jgp7.exception.DivisionByZeroException;
import com.jgp7.exception.ExitException;
import java.util.List;

/**
 * Created by Evgeni Kuntsevich on 30.08.2016.
 */
public class ArithmeticOperation {
    private static List<Double> digits;

    public static double division() throws ExitException, DivisionByZeroException {
        ConsoleHelper.writeMessage("You select division (for example: 3/2=1.5).");
        digits = ConsoleHelper.readTwoDigitsDivision();
        return digits.get(0) / digits.get(1);
    }

    public static double addition() throws ExitException {
        ConsoleHelper.writeMessage("You select addition (for example: 3+2=5.0).");
        digits = ConsoleHelper.readTwoDigits();
        return digits.get(0) + digits.get(1);
    }

    public static double subtraction() throws ExitException {
        ConsoleHelper.writeMessage("You select subtraction (for example: 3-2=1.0).");
        digits = ConsoleHelper.readTwoDigits();
        return digits.get(0) - digits.get(1);
    }

    public static double multiplication() throws ExitException {
        ConsoleHelper.writeMessage("You select multiplication (for example: 3*2=6.0).");
        digits = ConsoleHelper.readTwoDigits();
        return digits.get(0) * digits.get(1);
    }

    public static double involution() throws ExitException {
        ConsoleHelper.writeMessage("You select involution (for example: 3^2=9.0).");
        digits = ConsoleHelper.readTwoDigits();
        return Math.pow(digits.get(0), digits.get(1));
    }
}
