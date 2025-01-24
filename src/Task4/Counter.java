// Класс для подсчета количества созданных объектов
public class Counter {
    private static int count = 0; // Статический счетчик

    // Конструктор
    public Counter() {
        count++; // Увеличиваем счетчик при создании нового объекта
    }

    // Метод для получения информации о количестве созданных объектов
    public static int getCount() {
        return count;
    }
}
