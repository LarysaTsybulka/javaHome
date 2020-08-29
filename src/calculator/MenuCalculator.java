package calculator;

import java.util.Scanner;

public class MenuCalculator {
    private static final String MENU_MESSAGE = "Выберите функцию:";
    private static final String MENU_ADDITION = "1:Сложение";
    private static final String MENU_SUBTRACTION = "2: Разность";
    private static final String MENU_MULTIPLICATION = "3: Умножение";
    private static final String MENU_DIVISION = "4: Деление";
    private static final String MENU_EXIT = "0: Выход";
    private static final String ENTER_FIRST_NUMBER = "Введите первое число:";
    private static final String ENTER_SECOND_NUMBER = "Введите второе число:";
    private static final String SHOW_RESULT = "Результат равен: ";

    private void showMenu() {
        System.out.println(MENU_MESSAGE);
        System.out.println(MENU_ADDITION);
        System.out.println(MENU_SUBTRACTION);
        System.out.println(MENU_MULTIPLICATION);
        System.out.println(MENU_DIVISION);
        System.out.println(MENU_EXIT);
    }
    public void startMenu(){
        while (true) {
            showMenu();
            int action = chooseAction();
            if (action == 0) {
                System.out.println("Работа окончена!");
                break;
            } else {
                doAction(action);
            }
        }
    }
    private int chooseAction() {
        int numberAction;
        Scanner in = new Scanner(System.in);
        numberAction = in.nextInt();
        return numberAction;
    }

    private CalculatorParametrs enterNumbers() {
        CalculatorParametrs.Builder param = new CalculatorParametrs.Builder();
        System.out.println(ENTER_FIRST_NUMBER);
        Scanner in = new Scanner(System.in);
        param.setA(in.nextInt());
        System.out.println(ENTER_SECOND_NUMBER);
        param.setB(in.nextInt());
        return param.build();
    }

    private void doAction(int numberAction) {
        switch (numberAction) {
            case 1: {
                Calculator calc = new Calculator(enterNumbers());
                System.out.println(SHOW_RESULT + calc.addition());
                break;
            }
            case 2: {
                Calculator calc = new Calculator(enterNumbers());
                System.out.println(SHOW_RESULT + calc.subtraction());
                break;
            }
            case 3: {
                Calculator calc = new Calculator(enterNumbers());
                System.out.println(SHOW_RESULT + calc.multiplication());
                break;
            }
            case 4: {
                Calculator calc = new Calculator(enterNumbers());
                try {
                    System.out.println(SHOW_RESULT + calc.division());
                } catch (ArithmeticException exception) {
                    System.out.println("Делить на 0 нельзя!");
                }
                break;
            }
            default:
                System.out.println("Нет такой функции");
        }

    }
}
