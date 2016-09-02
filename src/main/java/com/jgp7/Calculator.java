package com.jgp7;

import com.jgp7.exception.DivisionByZeroException;
import com.jgp7.exception.ExitException;

/**
 * Created by Evgeni Kuntsevich on 02.09.2016.
 */
public class Calculator {
    public void run() {
        ConsoleHelper.welcomeMessage();

        while (true) {
            try {
                int numberOfOperation = getNumber();
                TypesArithmeticOperation operation =
                        getOperation(numberOfOperation);

                double resultOperation;

                switch (operation) {
                    case ADDITION:
                        resultOperation = ArithmeticOperation.addition();
                        break;
                    case SUBTRACTION:
                        resultOperation = ArithmeticOperation.subtraction();
                        break;
                    case MULTIPLICATION:
                        resultOperation = ArithmeticOperation.multiplication();
                        break;
                    case DIVISION:
                        resultOperation = ArithmeticOperation.division();
                        break;
                    case INVOLUTION:
                        resultOperation = ArithmeticOperation.involution();
                        break;
                    default:
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
            } catch (NumberFormatException e) {
                ConsoleHelper.writeMessage("You entered no digit or \"exit\". Please, enter digit of operation or \"exit\" and press \"Enter\" again.");
                continue;
            }

            ConsoleHelper.executeNextOperationMessage();
        }
    }

    private static int getNumber() throws ExitException {
        return Integer.parseInt(ConsoleHelper.readString());
    }

    private static TypesArithmeticOperation getOperation(int i) {
        return TypesArithmeticOperation.values()[i - 1];
    }
}
