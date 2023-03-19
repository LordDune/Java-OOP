package DZ.dz4;
import java.time.LocalDateTime;

public class LowerTask extends Task{

    public LowerTask(String name, String deadLine){
        super(name);
        priority = 1;
        this.deadLineDateTime = LocalDateTime.parse(deadLine+" 23:59", formatterDateTime);
    }

    public String getDeadString(){
        return this.deadLineDateTime.format(formatterDate);
    }

    @Override
    public String toString() {
        return String.format("%s\t\tLower\t\t%s", super.toString(), getDeadString());
    }

    @Override
    public int compareTo(Object o) {
        if ((this.priority == (((Task) o).getPriority()))) return (this.deadLineDateTime.compareTo(((LowerTask)o).getDead()));
        else return super.compareTo(o);
        }
}
