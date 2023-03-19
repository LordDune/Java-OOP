package DZ.dz4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Task implements Comparable{

    protected LocalDateTime createDateTime;
    protected LocalDateTime deadLineDateTime;
    protected LocalDateTime completedDateTime;
    protected String name;
    protected Integer id = ++count;
    protected static Integer count = 0;
    protected Integer priority;
    protected DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    protected DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    public Task(String name){
        this.createDateTime = LocalDateTime.now().plusHours(id); //чтобы время создания у всех была разное 
        this.name = name;
    }

    public String getCreateString(){
        return this.createDateTime.format(formatterDateTime);
    }

    public LocalDateTime getCreate(){
        return createDateTime;
    }

    public String getDeadString(){
        return this.deadLineDateTime.format(formatterDateTime);
    }

    public LocalDateTime getDead(){
        return deadLineDateTime;
    }

    public void SetCompletedDateTime(LocalDateTime dateTime){
        this.completedDateTime = dateTime;
    }

    public String getCompletedDateTime(){
        return this.completedDateTime.format(formatterDateTime);
    }

    public Integer getPriority(){
        return this.priority;
    }
    
    @Override
    public String toString(){
        return String.format("id-%d:\t\t%s\t%s", id, getCreateString(), name);
    }

    @Override
    public int compareTo(Object o){
        if ((this.priority == (((Task) o).getPriority()))) return this.compareTo(o);
        if (this.priority == 3) return -1;
        else if (((Task) o).getPriority() == 3) return 1;
        else if (this.deadLineDateTime.compareTo(((Task)o).getDead()) == 0) return this.priority.compareTo(((Task) o).getPriority());
        else return (this.deadLineDateTime.compareTo(((Task)o).getDead()));
    }
}