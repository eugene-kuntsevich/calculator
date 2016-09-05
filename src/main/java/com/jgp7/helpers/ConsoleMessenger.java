package com.jgp7.helpers;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Evgeni Kuntsevich on 30.08.2016.
 */
public class ConsoleMessenger {
    private static ResourceBundle resourceBundle;

    private static void getBundle() {
        if (resourceBundle == null) {
            resourceBundle = ResourceBundle.getBundle("messages", Locale.ENGLISH);
        } else return;
    }

    public static void start() {
        getBundle();
        System.out.println(resourceBundle.getString("welcome.message") +
                resourceBundle.getString("operation.items") +
                resourceBundle.getString("select.operation"));
    }

    public static void selectNextOperation() {
        System.out.println(resourceBundle.getString("next.operation") +
                resourceBundle.getString("operation.items") +
                resourceBundle.getString("select.operation"));
    }

    public static void divisionByZeroException() {
        System.out.println(resourceBundle.getString("division.zero") +
                resourceBundle.getString("operation.items") +
                resourceBundle.getString("select.operation"));
    }

    public static void enterNoNumberOperation() {
        System.out.println(resourceBundle.getString("enter.no.number"));
    }

    public static void resultOperation() {
        System.out.print(resourceBundle.getString("result.operation"));
    }

    public static void exit() {
        System.out.println(resourceBundle.getString("exit"));
    }

    public static void numberFormatException() {
        System.out.println(resourceBundle.getString("entered.no.digit") +
                resourceBundle.getString("operation.items") +
                resourceBundle.getString("select.operation"));
    }

    public static void repeatAgain() {
        System.out.println(resourceBundle.getString("repeat.again"));
    }

    public static void enterFirstDigit() {
        System.out.println(resourceBundle.getString("enter.first.digit"));
    }

    public static void enterSecondDigit() {
        System.out.println(resourceBundle.getString("enter.second.digit"));
    }

    public static void selectedSubtraction() {
        System.out.println(resourceBundle.getString("select.subtraction"));
    }

    public static void selectedDivision() {
        System.out.println(resourceBundle.getString("select.division"));
    }

    public static void selectedAddition() {
        System.out.println(resourceBundle.getString("select.addition"));
    }

    public static void selectedMultiplication() {
        System.out.println(resourceBundle.getString("select.multiplication"));
    }

    public static void selectedInvolution() {
        System.out.println(resourceBundle.getString("select.involution"));
    }
}
