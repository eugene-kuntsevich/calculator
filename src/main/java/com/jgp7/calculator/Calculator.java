package com.jgp7.calculator;

import com.jgp7.exception.DivisionByZeroException;
import com.jgp7.exception.EnterNoNumberOperationException;
import com.jgp7.exception.ExitException;
import com.jgp7.helpers.ConsoleMessenger;
import com.jgp7.helpers.HelperMethods;

/**
 * Created by Evgeni Kuntsevich on 02.09.2016.
 */
public class Calculator {
    public void run() {
        ConsoleMessenger.start();

        while (true) {
            try {
                int numberOfOperation = HelperMethods.getNumber();
                TypesArithmeticOperation operation =
                        HelperMethods.getOperation(numberOfOperation);

                double resultOperation = 0;

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
                }

                ConsoleMessenger.resultOperation();
                System.out.println(" " +
                        HelperMethods.getNumberWithoutZeroAfterDot(resultOperation));

            } catch (ExitException e) {
                ConsoleMessenger.exit();
                break;
            } catch (DivisionByZeroException e) {
                ConsoleMessenger.divisionByZeroException();
                continue;
            } catch (NumberFormatException e) {
                ConsoleMessenger.numberFormatException();
                continue;
            } catch (EnterNoNumberOperationException e) {
                ConsoleMessenger.enterNoNumberOperation();
                continue;
            }

            HelperMethods.sleep();
            ConsoleMessenger.selectNextOperation();
        }
    }
}
