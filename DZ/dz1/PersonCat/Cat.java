package DZ.dz1.PersonCat;

public class Cat {
    private String name;
    private int satiety;
    private Room room;


    public Cat(String name){
        this.name = name; 
        this.satiety = 2;
        this.room = Room.livingroom;      
    }


    public String getName(){
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;               
    }

    public void goRoom(Room room) {
        System.out.println(this.name + " ушла в " + room);
        if (this.satiety > 0) this.satiety--;
        this.room = room;               
    }

    public String getRoom() {
        return room.toString();               
    }

    public String getSatiety(){
        if (this.satiety == 2) return "сыта";
        else if (this.satiety == 1) return "немного голодна";
        else return "сильно голодна";
    }

    @Override
    public String toString(){
        return this.name + " находится в " + this.room + " и " + getSatiety();
    }

    public String tryCall(Person person){
        if (person.getRoom() == this.getRoom()) return this.name + " мяукает";
        return null;
    }

    public String eat(Person person){
        if (person.getRoom() == this.getRoom()){
            if (this.satiety < 2) {
                this.satiety = 2;
                return this.name + " поела и теперь сыта";
            }
            else return this.name + " уже сыта";
        }
        else return this.name + " находится в другой комнате";
        

     
    }
        
    
        
        
    }

