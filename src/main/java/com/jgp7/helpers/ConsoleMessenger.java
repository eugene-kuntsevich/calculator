package com.jgp7.helpers;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by Evgeni Kuntsevich on 30.08.2016.
 */
public class ConsoleMessenger {
    private static Locale locale = Locale.ENGLISH;
    private static final String PATH_PROPERTIES = "src/main/resources/messages.properties";
    private static ResourceBundle resourceBundle;

    private static void getBundle() {
        if (resourceBundle == null) {
            resourceBundle = ResourceBundle.getBundle("messages", locale);
        } else return;
    }

    public static void welcomeMessage() {
        getBundle();
        System.out.println(resourceBundle.getString("welcome.message") +
                resourceBundle.getString("operation.items") +
                resourceBundle.getString("select.operation"));
    }

    public static void executeNextOperationMessage() {
        System.out.println(resourceBundle.getString("next.operation") +
                resourceBundle.getString("operation.items") +
                resourceBundle.getString("select.operation"));
    }

    public static void divisionByZeroExceptionMessage() {
        System.out.println(resourceBundle.getString("division.zero") +
                resourceBundle.getString("operation.items") +
                resourceBundle.getString("select.operation"));
    }

    public static void enterNoNumberOperationMessage() {
        System.out.println(resourceBundle.getString("enter.no.number"));
    }

    public static void resultOperationMessage() {
        System.out.print(resourceBundle.getString("result.operation"));
    }

    public static void byeMessage() {
        System.out.println(resourceBundle.getString("good.bye"));
    }

    public static void numberFormatExceptionMessage() {
        System.out.println(resourceBundle.getString("entered.no.digit") +
                resourceBundle.getString("operation.items") +
                resourceBundle.getString("select.operation"));
    }

    public static void repeatAgainMessage() {
        System.out.println(resourceBundle.getString("repeat.again"));
    }

    public static void enterFirstDigitMessage() {
        System.out.println(resourceBundle.getString("enter.first.digit"));
    }

    public static void enterSecondDigitMessage() {
        System.out.println(resourceBundle.getString("enter.second.digit"));
    }

    public static void selectSubtractionMessage() {
        System.out.println(resourceBundle.getString("select.subtraction"));
    }

    public static void selectDivisionMessage() {
        System.out.println(resourceBundle.getString("select.division"));
    }

    public static void selectAdditionMessage() {
        System.out.println(resourceBundle.getString("select.addition"));
    }

    public static void selectMultiplicationMessage() {
        System.out.println(resourceBundle.getString("select.multiplication"));
    }

    public static void selectInvolutionMessage() {
        System.out.println(resourceBundle.getString("select.involution"));
    }
}
