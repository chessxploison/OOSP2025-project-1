import java.util.Scanner;

public class View {
    private Scanner scanner;

    public View() {
        scanner = new Scanner(System.in);
    }

    // Метод для ввода выражения
    public String getExpression() {
        System.out.print("Введите математическое выражение: ");
        return scanner.nextLine();
    }

    // Метод для вывода результата
    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    // Метод для вывода ошибки
    public void displayError(String message) {
        System.out.println("Ошибка: " + message);
    }
}