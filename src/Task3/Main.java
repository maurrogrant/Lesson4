// Главный класс для запуска программы
public class Main {
    public static void main(String[] args) {
        // Пример использования
        double num1 = 15.5;
        double num2 = 4.5;

        System.out.println("Сложение: " + Calculator.add(num1, num2));
        System.out.println("Вычитание: " + Calculator.subtract(num1, num2));
        System.out.println("Умножение: " + Calculator.multiply(num1, num2));
        System.out.println("Деление: " + Calculator.divide(num1, num2));
        System.out.println("10% от " + num1 + ": " + Calculator.percentage(num1, 10));
    }
}
