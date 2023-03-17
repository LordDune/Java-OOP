package DZ.dz4;


public class MiddleTask extends Task implements MidLow{

    Integer deadLineTime;
    Integer hours;


    public MiddleTask(String name, Integer deadLineTime, Integer hours){
        super(name);
        this.deadLineTime = deadLineTime; // переделать в конвертацию реального типа date
        this.hours = hours;
    }

    public Integer getDeadLineTime(){
        return this.deadLineTime;
    }

    @Override
    public String toString() {
        return String.format("%s\tMiddle\t\t%s", super.toString(), deadLineTime);
    }

    // @Override
    // public int compareTo(Object o) {
    //     if (this.getClass() == o.getClass()){
    //         return this.deadLineTime.compareTo(((MiddleTask)o).getDeadLineTime());
    //     }
    //     else return 1;
    //     }
}
