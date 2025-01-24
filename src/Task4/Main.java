// Главный класс для запуска программы
public class Main {
    public static void main(String[] args) {
        // Создаем несколько объектов
        Counter obj1 = new Counter();
        Counter obj2 = new Counter();
        Counter obj3 = new Counter();

        // Получаем информацию о количестве созданных объектов
        System.out.println("Количество созданных объектов: " + Counter.getCount());
    }
}
