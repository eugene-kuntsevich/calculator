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
                int numberOfOperation = Integer.parseInt(ConsoleHelper.readString());
                double resultOperation = 0;

                if (numberOfOperation == TypesArithmeticOperation.ADDITION.ordinal() + 1)
                    resultOperation = ArithmeticOperation.addition();
                else if (numberOfOperation == TypesArithmeticOperation.SUBTRACTION.ordinal() + 1)
                    resultOperation = ArithmeticOperation.subtraction();
                else if (numberOfOperation == TypesArithmeticOperation.MULTIPLICATION.ordinal() + 1)
                    resultOperation = ArithmeticOperation.multiplication();
                else if (numberOfOperation == TypesArithmeticOperation.DIVISION.ordinal() + 1)
                    resultOperation = ArithmeticOperation.division();
                else if (numberOfOperation == TypesArithmeticOperation.INVOLUTION.ordinal() + 1)
                    resultOperation = ArithmeticOperation.involution();
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
