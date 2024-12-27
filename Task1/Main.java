import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        
        String result = replaceCensorship(input);
        
        System.out.println("Результат: " + result);
    }

    public static String replaceCensorship(String text) {
        return text.replaceAll("бяка", "вырезано цензурой");
    }
}
