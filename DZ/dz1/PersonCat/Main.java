package DZ.dz1.PersonCat;

public class Main {

      public static void main(String[] args) {
        
        Person man = new Person("Вася");
        Cat cat = new Cat("Мурка");
        System.out.println(man);
        System.out.println(cat);
        man.call(cat);
        cat.goRoom(Room.balcony);
        man.call(cat);
        System.out.println(cat);
        cat.goRoom(Room.bedroom);
        System.out.println(cat);
        man.feed(cat);
        man.goRoom(Room.bedroom);
        man.feed(cat);
        man.feed(cat);

      }
}
