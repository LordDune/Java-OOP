package DZ.dz1.PersonCat;

public class Person {
    private String name;
    private Room room;

    public Person(String name){
        this.name = name;
        this.room = Room.livingroom;
    }

    public String getName(){ 
        return name;
    }
    
    public void setName(String name) {
        this.name = name;               
    }

    public void goRoom(Room room) {
        System.out.println(this.name + " ушел в " + room);
        this.room = room;               
    }

    public String getRoom() {
        return room.toString();               
    }

    @Override
    public String toString(){
        return this.name + " находится в " + this.room;
    }

    public void call(Cat cat){
        System.out.print(this.name + " зовет кошку -> ");
        if (cat.tryCall(this) != null) System.out.println(cat.tryCall(this));
        else System.out.printf("%s не слышит, так как находится в другой комнате \n", cat.getName());
    }

    public void feed(Cat cat){
        System.out.print(this.name + " пытается покормить " + cat.getName() + " -> ");
        System.out.println(cat.eat(this));
    }

}

