package Task3;

import java.util.Scanner;

// Главный класс для запуска программы
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Пример использования
        System.out.print("Введите первое число (целое или дробное): ");
        double num1 = scanner.nextDouble();

        System.out.print("Введите второе число (целое или дробное): ");
        double num2 = scanner.nextDouble();

        System.out.println("Сложение: " + Calculator.add(num1, num2));
        System.out.println("Вычитание: " + Calculator.subtract(num1, num2));
        System.out.println("Умножение: " + Calculator.multiply(num1, num2));
        System.out.println("Деление: " + Calculator.divide(num1, num2));
        System.out.println("10% от " + num1 + ": " + Calculator.percentage(num1, 10));

        scanner.close();
    }
}
