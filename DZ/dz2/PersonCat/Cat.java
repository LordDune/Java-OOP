package DZ.dz2.PersonCat;

import DZ.dz2.PersonCat.Interface.IntCall;
import DZ.dz2.PersonCat.Interface.IntPet;

public class Cat extends AnimalBase implements IntCall, IntPet {

    private int satiety;

    public Cat(String name){
        super(name);
        getEnough();
    }
    
    public String getSatiety(){
        if (this.satiety == 2) return "сыта";
        else if (this.satiety == 1) return "немного голодна";
        else return "сильно голодна";
    }

    public void getHungry(){
        if (this.satiety > 0) {
            this.satiety--;
        }
    }

    public void getEnough(){
        this.satiety = 2;
    }

    public void getCall(AnimalBase animal){
        System.out.println(this.name + " мяукает");
    }

    public void getFood(){
        if (this.satiety < 2) {
            this.satiety = 2;
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
        return super.toString() + " и " + getSatiety();
    }

    public void goRoom(Room room) {
        super.goRoom(room);
        if (this.satiety > 0) this.satiety--;
        System.out.printf("%s ушла в %s и %s\n", this.name, this.getRoom(), this.getSatiety());
    }
    }
