import java.util.Scanner;

public class CalculatorMain {
    public static final String MENU_MESSAGE = "Выберите функцию:";
    public static final String MENU_ADDITION = "1:Сложение";
    public static final String MENU_SUBTRACTION = "2: Разность";
    public static final String MENU_MULTIPLICATION = "3: Умножение";
    public static final String MENU_DIVISION = "4: Деление";
    public static final String MENU_EXIT = "0: Выход";
    public static final String ENTER_FIRST_NUMBER = "Введите первое число:";
    public static final String ENTER_SECOND_NUMBER = "Введите второе число:";
    public static final String SHOW_RESULT = "Результат равен: ";


    public static void main(String[] args) {
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

    public static void showMenu() {
        System.out.println(MENU_MESSAGE);
        System.out.println(MENU_ADDITION);
        System.out.println(MENU_SUBTRACTION);
        System.out.println(MENU_MULTIPLICATION);
        System.out.println(MENU_DIVISION);
        System.out.println(MENU_EXIT);
    }

    public static int chooseAction() {
        int numberAction;
        Scanner in = new Scanner(System.in);
        numberAction = in.nextInt();
        return numberAction;
    }

    public static int[] enterNumbers() {
        int[] numbers = new int[2];
        System.out.println(ENTER_FIRST_NUMBER);
        Scanner in = new Scanner(System.in);
        numbers[0] = in.nextInt();
        System.out.println(ENTER_SECOND_NUMBER);
        numbers[1] = in.nextInt();
        return numbers;
    }

    public static void doAction(int numberAction) {
        if ((numberAction < 1) || (numberAction > 4)) {
            System.out.println("Такой функции не существует!");
        } else {
            int a, b;
            System.out.println(ENTER_FIRST_NUMBER);
            Scanner in = new Scanner(System.in);
            a = in.nextInt();
            System.out.println(ENTER_SECOND_NUMBER);
            b = in.nextInt();
            switch (numberAction) {
                case 1: {
                    Calculator calc = new Calculator(a, b);
                    System.out.println(SHOW_RESULT + calc.addition());
                    break;
                }
                case 2: {
                    Calculator calc = new Calculator(a, b);
                    System.out.println(SHOW_RESULT + calc.subtraction());
                    break;
                }
                case 3: {
                    Calculator calc = new Calculator(a, b);
                    System.out.println(SHOW_RESULT + calc.multiplication());
                    break;
                }
                case 4: {
                    Calculator calc = new Calculator(a, b);
                    if (calc.division() == 0) {
                        System.out.println("Делить на 0 нельзя!");
                    } else {
                        System.out.println(SHOW_RESULT + calc.division());
                    }
                    break;
                }

            }

        }
    }
}
