package DZ.dz2.PersonCat;

import DZ.dz2.PersonCat.Interface.IntCall;
import DZ.dz2.PersonCat.Interface.IntPet;
import java.util.Random;

public class Cat extends AnimalBase implements IntCall, IntPet, Comparable {

    private Integer satiety;
    Random r = new Random();

    public Cat(String name){
        super(name);
        getEnough();
    }
    
    public String getSatiety(){
        if (this.satiety > 8) return "сыта";
        else if (this.satiety <= 8 && this.satiety >= 5) return "немного голодна";
        else return "сильно голодна";
    }

    public void getHungry(){
        if (this.satiety > 0) {
            this.satiety--;
        }
    }

    public void getEnough(){
        this.satiety = r.nextInt(10);
    }

    public void getCall(AnimalBase animal){
        System.out.println(this.name + " мяукает");
    }

    public void getFood(){
        if (this.satiety < 10) {
            this.satiety = 10;
            System.out.println(this.name + " поела и теперь сыта");
        }
            else System.out.println(this.name + " уже сыта");
        }

    public void call(AnimalBase animal){
        System.out.printf("%s мяукает к %s -> ", this.name, animal.getName());
        if (animal instanceof IntCall) {
            ((IntCall) animal).getCall(this);}
    }

    @Override
    public String toString(){
        return String.format("%s и %s (%d)", super.toString(), getSatiety(), this.satiety);
    }

    public void goRoom(Room room) {
        super.goRoom(room);
        if (this.satiety > 0) this.satiety--;
        System.out.printf("%s ушла в %s и %s\n", this.name, this.getRoom(), this.getSatiety());
    }

    @Override
    public int compareTo(Object o) {
        return this.satiety.compareTo(((Cat) o).satiety);
    }
    }
