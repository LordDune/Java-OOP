package DZ.dz4;

import java.time.LocalDateTime;

public class MiddleTask extends Task{

    public MiddleTask(String name, String deadLineDateTime, int hours){
        super(name);
        priority = 2;
        this.deadLineDateTime = LocalDateTime.parse(deadLineDateTime+" 00:00", formatterDateTime).plusHours(hours);
    }

    @Override
    public String toString() {
        return String.format("%s\t\tMiddle\t\t%s", super.toString(), getDeadString());
    }

    @Override
    public int compareTo(Object o) {
        if ((this.priority == (((Task) o).getPriority()))) return (this.deadLineDateTime.compareTo(((MiddleTask)o).getDead()));
        else return super.compareTo(o);
    }
}
