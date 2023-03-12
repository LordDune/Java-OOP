package DZ.dz2.PersonCat;

public class Main {

      public static void main(String[] args) {
        
        Person man = new Person("Вася");
        Cat cat = new Cat("Мурка");
        System.out.println(man);
        System.out.println(cat);
        man.call(cat);
        cat.call(man);
        cat.goRoom(Room.balcony);
        man.call(cat);
        cat.goRoom(Room.bedroom);
        man.feed(cat);
        cat.call(man);
        man.goRoom(Room.bedroom);
        man.feed(cat);
        man.feed(cat);
      }
}
