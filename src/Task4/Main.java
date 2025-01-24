    public static void main(String[] args) {
        // Создание объектов
        for (int i = 0; i < 5; i++) {
            new ObjectCounter();
        }

        // Получение информации о количестве созданных объектов
        System.out.println("Количество созданных объектов: " + ObjectCounter.getCount());
    }
