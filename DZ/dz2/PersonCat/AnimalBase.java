package DZ.dz2.PersonCat;

public abstract class AnimalBase {
    protected String name;
    protected Room room;
    
    AnimalBase(String name){
        setName(name);
        this.room = Room.livingroom;
    }

    public String getName(){ 
        return name;
    }
    
    public void setName(String name) {
        this.name = name;               
    }

    public void goRoom(Room room) {
        this.room = room;
    }

    public String getRoom() {
        return room.toString();               
    }
    
    public Boolean isClose(AnimalBase animal){
        return (this.getRoom() == animal.getRoom());
    }

    @Override
    public String toString(){
        return this.name + " находится в " + this.room;
    }
}
