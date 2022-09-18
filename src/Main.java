import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    printMenu();
    int userInput = scanner.nextInt();

    StepTracker stepTracker = new StepTracker();
    while (userInput != 0){
        int command = userInput;

        if(command == 1){
            System.out.println("Введите номер месяца:");
            int month = scanner.nextInt();
            while((month < 0) || (month >= 12)) {
                System.out.println("Такого месяца не существует, попробуйте еще.");
                month = scanner.nextInt();
            }


            System.out.println("Введите номер дня:");
            int day = scanner.nextInt();
            while((day < 0) || (day > 30)) {
                System.out.println("Такого дня не существует, попробуйте еще.");
                day = scanner.nextInt();
                }

            System.out.println("Введите количсевто пройденных шагов:");
            int step = scanner.nextInt();
            while(step < 0) {
                System.out.println("Количество шагов не может быть отрицательным, попробуйте еще.");
                step = scanner.nextInt();
            }

            stepTracker.inUserStep(month, day, step);

        }
        else if(command == 2){
            System.out.println("За какой месяц вы хотите вывести статистику?");
            int month = scanner.nextInt();
            System.out.println();
            stepTracker.printStatDay(month);
        }
        else if(command == 3){
            System.out.println("Какая ваша новая цель?");
            int goal = scanner.nextInt();
            while(goal < 0) {
                System.out.println("Количество шагов не может быть отрицательным, попробуйте еще.");
                goal = scanner.nextInt();
            }

            stepTracker.goalStep(goal);

        }
        else if(command == 0){
            break;
        } else {
            System.out.println("Такой команды не существует, попробуйте еще.");
            System.out.println();
        }
        printMenu(); // печатаем меню ещё раз перед завершением предыдущего действия
        userInput = scanner.nextInt(); // повторное считывание данных от пользователя
    }

    }

    public static void printMenu() {
        while(true){
            System.out.println("1- Ввести количество шагов за определенный день");
            System.out.println("2- Напечатать статистику за определенный месяц");
            System.out.println("3- Изменить цель по количеству шагов в день");
            System.out.println("0- Выход");
            break;
        }
    }
}


