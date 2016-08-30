package com.jgp7;

import com.jgp7.exception.DivisionByZeroException;
import com.jgp7.exception.ExitException;

import java.io.IOException;

/**
 * Created by Evgeni Kuntsevich on 30.08.2016.
 */
public class MainClass {
    public static void main(String[] args) throws IOException {
        ConsoleHelper.welcomeMessage();

        while (true) {
            try {
                String numberOfOperation = ConsoleHelper.readString();
                double resultOperation = 0;

                if (numberOfOperation.equals("1")) resultOperation = ArithmeticOperation.addition();
                else if (numberOfOperation.equals("2")) resultOperation = ArithmeticOperation.subtraction();
                else if (numberOfOperation.equals("3")) resultOperation = ArithmeticOperation.multiplication();
                else if (numberOfOperation.equals("4")) resultOperation = ArithmeticOperation.division();
                else if (numberOfOperation.equals("5")) resultOperation = ArithmeticOperation.involution();
                else {
                    ConsoleHelper.writeMessage("You entered no number of operation. Please, try again.");
                    continue;
                }

                ConsoleHelper.writeMessage("Result of operation = " + String.valueOf(resultOperation));

            } catch (ExitException e) {
                ConsoleHelper.writeMessage("Good bye!");
                break;
            } catch (DivisionByZeroException e) {
                ConsoleHelper.divisionByZeroExceptionMessage();
                continue;
            }

            ConsoleHelper.executeNextOperationMessage();
        }
    }
}
