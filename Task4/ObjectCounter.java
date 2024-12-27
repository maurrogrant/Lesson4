public class ObjectCounter {
    // Статическая переменная для хранения количества созданных объектов
    private static int count = 0;

    // Конструктор
    public ObjectCounter() {
        count++;
    }
    // Метод для получения информации о количестве созданных объектов
    public static int getCount() {
        return count;
    }
}
