public class Main {

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

    public static void main(String[] args) {
        // Пример использования
        double num1 = 15.5;
        double num2 = 4.5;

        System.out.println("Сложение: " + add(num1, num2));
        System.out.println("Вычитание: " + subtract(num1, num2));
        System.out.println("Умножение: " + multiply(num1, num2));
        System.out.println("Деление: " + divide(num1, num2));
        System.out.println("10% от " + num1 + ": " + percentage(num1, 10));
    }
}
