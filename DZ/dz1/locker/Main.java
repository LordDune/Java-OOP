package OOP.DZ.dz1.locker;

public class Main {

    public static void main(String[] args) {
        Closet closet = new Closet(10,50); // Создан Closet: Шкаф. Вещей: 10 из 50, состояние: Closed
        Person player = new Person(); // Создан персонаж: Player
        player.open(closet); // !!! Player: попытка открыть Шкаф - Шкаф успешно открыт
        player.open(closet); // !!! Player: попытка открыть Шкаф - Шкаф уже открыт
        player.get(closet, 10); // !!! Player: попытка взять вещи из Шкаф - Player взял из Шкаф 10 вещей
        System.out.println(closet); // Closet: Шкаф. Вещей: 0 из 50, состояние: Opened
        player.close(closet); // !!! Player: попытка закрыть Шкаф - Шкаф успешно закрыт
        player.put(closet, 10); // !!! Player: попытка положить вещи в Шкаф - Невозможно положить вещи. Шкаф закрыт
        System.out.println(player); //Player: 10 вещей
        System.out.println(closet); // Closet: Шкаф. Вещей: 0 из 50, состояние: Closed
        player.intThings(10); // Player получил 50 вещей. Общее количество: 60
        player.open(closet); // !!! Player: попытка открыть Шкаф - Шкаф успешно открыт
        player.put(closet, 35); // !!! Player: попытка положить вещи в Шкаф - Шкаф: переполнен
        System.out.println(closet); // Closet: Шкаф. Вещей: 0 из 50, состояние: Opened
        System.out.println(player); // Player: 60 вещей
        System.out.println(closet.tryOpen());
    }
}
