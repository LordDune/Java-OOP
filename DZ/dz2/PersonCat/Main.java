package DZ.dz2.PersonCat;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

      public static void main(String[] args) {
        
        
        // реализация функционала программы
        // Person man = new Person("Вася");
        // Cat cat = new Cat("Мурка");
        // System.out.println(man);
        // System.out.println(cat);
        // man.call(cat);
        // cat.call(man);
        // cat.goRoom(Room.balcony);
        // man.call(cat);
        // cat.goRoom(Room.bedroom);
        // man.feed(cat);
        // cat.call(man);
        // man.goRoom(Room.bedroom);
        // man.feed(cat);
        // man.feed(cat);
        // реализация стандартных интерфейсов
        Cat cat1 = new Cat("Лариса");
        Cat cat2 = new Cat("Буся");
        Cat cat3 = new Cat("Маша");
        Cat cat4 = new Cat("Шуня");
        Cat cat5 = new Cat("Ася");
        ArrayList<Cat> list = new ArrayList<>(); list.add(cat1); list.add(cat2); list.add(cat3); list.add(cat4); list.add(cat5);
        System.out.println("До сортировки");
        for (Cat i: list){
          System.out.println(i);
        }
        System.out.println("После сортировки");
        Collections.sort(list);
        for (Cat i: list){
          System.out.println(i);
        }

        

        
        
      }
}
