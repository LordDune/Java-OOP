package DZ.dz2.PersonCat;

import DZ.dz2.PersonCat.Interface.IntCall;
import DZ.dz2.PersonCat.Interface.IntPet;
import DZ.dz2.PersonCat.Interface.IntPetOwner;

public class Person extends AnimalBase implements IntCall, IntPetOwner {

    public Person(String name){
        super(name);
    }
    
    public void call(AnimalBase animal){
        System.out.printf("%s обращается к %s -> ", this.name, animal.getName());
        if (this.isClose(animal)) {if (animal instanceof IntCall) ((IntCall) animal).getCall(this);}
        else System.out.println(animal.getName() + " находится в другой комнате");
    }

    public void getCall(AnimalBase animal){
        if ((animal instanceof IntPet)) {
            if (this.isClose(animal)) 
                System.out.printf("%s погладил %s\n", this.getName(), animal.getName());
            else System.out.println("\n");
            }
        else System.out.println("\n");
    }


    public void feed(AnimalBase animal){
        System.out.print(this.name + " пытается покормить " + animal.getName() + " -> ");
        if (this.isClose(animal)) {if (animal instanceof IntPet) ((IntPet)(animal)).getFood();}
        else System.out.println(animal.getName() + " находится в другой комнате");
    }

    public void goRoom(Room room) {
        super.goRoom(room);
        System.out.printf("%s ушeл в %s\n", this.name, this.getRoom());
    }

}

