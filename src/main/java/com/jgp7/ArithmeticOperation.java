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
        digits = ConsoleHelper.readTwoDigitsDivision();
        return digits.get(0) / digits.get(1);
    }

    public static double addition() throws ExitException {
        digits = ConsoleHelper.readTwoDigits();
        return digits.get(0) + digits.get(1);
    }

    public static double subtraction() throws ExitException {
        digits = ConsoleHelper.readTwoDigits();
        return digits.get(0) - digits.get(1);
    }

    public static double multiplication() throws ExitException {
        digits = ConsoleHelper.readTwoDigits();
        return digits.get(0) * digits.get(1);
    }

    public static double involution() throws ExitException {
        digits = ConsoleHelper.readTwoDigits();
        return Math.pow(digits.get(0), digits.get(1));
    }
}
