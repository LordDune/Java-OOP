package OOP.DZ.dz1.locker;

public class Person {
    
    private String name;
    private int things = 0;


    public Person(String name) {
        this.name = name;
        System.out.printf("Создан персонаж: %s\n", this.getName());
        System.out.println("_".repeat(150));
    }

    public Person() {
        this("Player");
    }

    public String getName(){  
        return name;
    }
    
    public void setName(String name) { 
        this.name = name;               
    }

    public void intThings(int value) { 
        this.things += value;
        System.out.printf("%s получил %d вещей. Общее количество: %d\n", this.name, value, this.things);               
    }
    @Override
    public String toString(){
        return String.format("%s: %d вещей\n", this.name, this.things);
    }

    public void open(Closet closet) {
        System.out.print(name + ": попытка открыть " + closet.getName() + " -> "); 
        System.out.println(closet.tryOpen());
    }

    public void close(Closet closet) {
        System.out.print(name + ": попытка закрыть " + closet.getName() + " -> ");
        System.out.println(closet.tryClose());
     }

    public void get(Closet closet, int value) {
        System.out.print(name + ": попытка взять вещи из " + closet.getName() + " -> ");
        int x = closet.tryGet(value);
        this.things += x;
        if (x != 0) System.out.printf("%s взял из %s %d вещей\n", this.name, closet.getName(), x);
     }

     public void put(Closet closet, int value) {
        System.out.print(name + ": попытка положить вещи в " + closet.getName() + " -> ");
        if (value > this.things) System.out.println("Недостаточно вещей");
        else {
            int x = closet.tryPut(value);
            this.things -= x;
            if (x != 0) System.out.printf("%s положил в %s %d вещей\n", this.name, closet.getName(), x);}
        
     }
}
