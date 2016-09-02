package com.jgp7;

import com.jgp7.exception.DivisionByZeroException;
import com.jgp7.exception.ExitException;
import com.jgp7.helpers.ConsoleMessenger;
import com.jgp7.helpers.HelperMethods;

/**
 * Created by Evgeni Kuntsevich on 02.09.2016.
 */
public class Calculator {
    public void run() {
        ConsoleMessenger.welcomeMessage();

        while (true) {
            try {
                int numberOfOperation = HelperMethods.getNumber();
                TypesArithmeticOperation operation =
                        HelperMethods.getOperation(numberOfOperation);

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
                        ConsoleMessenger.writeMessage("You entered no number of operation. Please, try again.");
                        continue;
                }

                ConsoleMessenger.writeMessage("Result of operation = " + String.valueOf(resultOperation));

            } catch (ExitException e) {
                ConsoleMessenger.writeMessage("Good bye!");
                break;
            } catch (DivisionByZeroException e) {
                ConsoleMessenger.divisionByZeroExceptionMessage();
                continue;
            } catch (NumberFormatException e) {
                ConsoleMessenger.writeMessage("You entered no digit or \"exit\". Please, enter digit of operation or \"exit\" and press \"Enter\" again.");
                continue;
            }

            ConsoleMessenger.executeNextOperationMessage();
        }
    }
}
