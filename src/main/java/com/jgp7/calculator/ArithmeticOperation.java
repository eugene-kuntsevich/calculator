package com.jgp7.calculator;

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
        ConsoleMessenger.selectDivisionMessage();
        digits = HelperMethods.readTwoDigitsDivision();
        return digits.get(0) / digits.get(1);
    }

    public static double addition() throws ExitException {
        ConsoleMessenger.selectAdditionMessage();
        digits = HelperMethods.readTwoDigits();
        return digits.get(0) + digits.get(1);
    }

    public static double subtraction() throws ExitException {
        ConsoleMessenger.selectSubtractionMessage();
        digits = HelperMethods.readTwoDigits();
        return digits.get(0) - digits.get(1);
    }

    public static double multiplication() throws ExitException {
        ConsoleMessenger.selectMultiplicationMessage();
        digits = HelperMethods.readTwoDigits();
        return digits.get(0) * digits.get(1);
    }

    public static double involution() throws ExitException {
        ConsoleMessenger.selectInvolutionMessage();
        digits = HelperMethods.readTwoDigits();
        return Math.pow(digits.get(0), digits.get(1));
    }
}
