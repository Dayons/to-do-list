import java.util.LinkedList;
public class ToDoList {
    LinkedList<String> tasks = new LinkedList<>();

    public void addTask(String task) {
        tasks.add(task);
        System.out.println("Задача добавлена: " + task);
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            String completedTask = tasks.get(index);
            tasks.remove(index);
            System.out.println("Задача выполнена и удалена: " + completedTask);
        } else {
            System.out.println("Неверный номер задачи");
        }
    }

    public void displayTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список дел пуст");
        } else {
            System.out.println("Текущий список дел:");
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println((i + 1) + ". " + tasks.get(i));
            }
        }
    }
}

