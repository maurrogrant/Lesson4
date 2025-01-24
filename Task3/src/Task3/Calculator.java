// Класс для выполнения математических операций
public class Calculator {
    // Метод для сложения
    public static double add(double a, double b) {
        return a + b;
    }

    // Метод для вычитания
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Метод для умножения
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Метод для деления
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Деление на ноль невозможно.");
        }
        return a / b;
    }

    // Метод для взятия процента от числа
    public static double percentage(double a, double percent) {
        return (a * percent) / 100;
    }
}
