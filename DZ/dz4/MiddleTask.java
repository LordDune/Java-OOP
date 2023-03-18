package DZ.dz4;

import java.time.LocalDate;
import java.time.LocalTime;

public class MiddleTask extends Task implements MidLow{

    LocalDate deadLineDate;
    LocalTime deadLineTime;



    public MiddleTask(String name, Integer y, Integer m, Integer d, Integer h){
        super(name);
        this.deadLineDate = LocalDate.of(y, m, d);
        this.deadLineTime = LocalTime.of(h, 00);

    }

    public String getDeadLineDate(){
        return this.deadLineDate.toString();
    }

    public String getDeadLineTime(){
        return this.deadLineTime.toString();
    }

    @Override
    public String toString() {
        return String.format("%s\tMiddle\t\t%s\t%s", super.toString(), deadLineDate, deadLineTime);
    }

    // @Override
    // public int compareTo(Object o) {
    //     if (this.getClass() == o.getClass()){
    //         return this.deadLineTime.compareTo(((MiddleTask)o).getDeadLineTime());
    //     }
    //     else return 1;
    //     }
}
