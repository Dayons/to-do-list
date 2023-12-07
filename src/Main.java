import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            ToDoList toDoList = new ToDoList();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nВыберите действие:");
                System.out.println("1. Добавить задачу");
                System.out.println("2. Выполнить задачу");
                System.out.println("3. Отобразить список дел");
                System.out.println("4. Выйти");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Введите задачу:");
                        String task = scanner.next(); //
                        toDoList.addTask(task);
                        break;
                    case 2:
                        System.out.println("Введите номер выполненной задачи:");
                        int index = scanner.nextInt() - 1;
                        toDoList.completeTask(index);
                        break;
                    case 3:
                        toDoList.displayTasks();
                        break;
                    case 4:
                        System.out.println("Программа закрыта.");
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }
        }
    }