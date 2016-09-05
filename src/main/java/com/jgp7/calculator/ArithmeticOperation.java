package com.jgp7.calculator;

import com.jgp7.exception.DivisionByZeroException;
import com.jgp7.helpers.ConsoleMessenger;
import com.jgp7.helpers.HelperMethods;

import java.util.List;

/**
 * Created by Evgeni Kuntsevich on 30.08.2016.
 */
public class ArithmeticOperation {
    private static List<Double> digits;

    public static double division() throws DivisionByZeroException {
        ConsoleMessenger.selectedDivision();
        digits = HelperMethods.readTwoDigitsDivision();
        return digits.get(0) / digits.get(1);
    }

    public static double addition() {
        ConsoleMessenger.selectedAddition();
        digits = HelperMethods.readTwoDigits();
        return digits.get(0) + digits.get(1);
    }

    public static double subtraction() {
        ConsoleMessenger.selectedSubtraction();
        digits = HelperMethods.readTwoDigits();
        return digits.get(0) - digits.get(1);
    }

    public static double multiplication() {
        ConsoleMessenger.selectedMultiplication();
        digits = HelperMethods.readTwoDigits();
        return digits.get(0) * digits.get(1);
    }

    public static double involution() {
        ConsoleMessenger.selectedInvolution();
        digits = HelperMethods.readTwoDigits();
        return Math.pow(digits.get(0), digits.get(1));
    }
}
