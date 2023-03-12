package OOP.DZ.dz1.locker;

public class Closet {
    
    private String name;
    private State state = State.Closed; 
    private int things;
    private int maxThings;

     enum State{
        Opened, Closed;
    }

    public Closet(int things, int maxThings){
        this.name = "Шкаф";
        this.state = State.Closed;
        this.things = things;
        this.maxThings = maxThings;
        System.out.printf("Создан %s", toString());
    }

    public Closet(){
        this(0, 20);
    }
    
    public String getName(){  
        return name;
    }
    
    public void setName(String name) { 
        this.name = name;               
    }

    @Override
    public String toString(){
        return String.format("Closet: %s. Вещей: %d из %d, состояние: %s\n", this.name, things, maxThings, state);
    }

    public String tryOpen(){
        if (state == State.Opened) return this.getName() + " уже открыт";
        else {state = State.Opened; return this.getName() + " успешно открыт";}
    }

    public String tryClose(){
        if (state == State.Closed) return this.getName() + " уже закрыт";
        else {state = State.Closed; return this.getName() + " успешно закрыт";}
    }

    public int tryGet(int value){
        if (this.state == State.Closed){
            System.out.println(String.format("Невозможно взять вещи, %s закрыт", this.name));
            return 0;
        }
        else {
            if (value > this.things){
                System.out.println(String.format("%s: недостаточно вещей", this.name));
                return 0;
            }
             else {
                this.things -= value;
                return value;
            }
        }
        
    }

    public int tryPut(int value){
        if (this.state == State.Closed){
            System.out.println(String.format("Невозможно положить вещи. %s закрыт", this.name));
            return 0;
        }
        else {
            if (value+this.things > this.maxThings){
                System.out.println(String.format("%s: переполнен", this.name));
                return 0;
            }
             else {
                this.things += value;
                return value;
            }
        }
        
    }

}


   