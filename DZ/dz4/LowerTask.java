package DZ.dz4;

public class LowerTask extends Task implements MidLow{
    
    Integer deadLineTime;


    public LowerTask(String name, Integer deadLineTime){
        super(name);
        this.deadLineTime = deadLineTime; // переделать в конвертацию реального типа date
    }

    public Integer getDeadLineTime(){
        return this.deadLineTime;
    }

    @Override
    public String toString() {
        return String.format("%s\tLower\t\t%s", super.toString(), deadLineTime); 
    }

    // @Override
    // public int compareTo(Object o) {
    //     if (this.getClass() == o.getClass()){
    //         return this.deadLineTime.compareTo(((MiddleTask)o).getDeadLineTime());
    //     }
    //     else return 1;
    //     }
}
