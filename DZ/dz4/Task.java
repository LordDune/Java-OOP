package DZ.dz4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;

public abstract class Task implements Comparable, Iterator<String>{

    protected LocalDateTime createDateTime;
    protected LocalDateTime deadLineDateTime;
    protected LocalDateTime completedDateTime;
    protected String name;
    protected Integer id = ++count;
    protected static Integer count = 0;
    protected Integer priority;
    protected DateTimeFormatter formatterDateTime = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
    protected DateTimeFormatter formatterDate = DateTimeFormatter.ofPattern("dd.MM.yyyy\t");
    protected int index;

    public Task(String name){
        this.createDateTime = LocalDateTime.now().plusHours(id); //чтобы время создания у всех была разное 
        this.name = name;
    }

    public String getCreateString(){
        if (this.createDateTime != null) return this.createDateTime.format(formatterDateTime);
        else return "";
    }

    public LocalDateTime getCreate(){
        return createDateTime;
    }

    public String getDeadString(){
        if (this.deadLineDateTime != null) return this.deadLineDateTime.format(formatterDateTime);
        else return "do it NOW!\t";
    }

    public LocalDateTime getDead(){
        return deadLineDateTime;
    }

    public void SetCompletedDateTime(LocalDateTime dateTime){
        this.completedDateTime = dateTime;
    }

    public String getCompletedDateTime(){
        if (this.completedDateTime != null) return this.completedDateTime.format(formatterDateTime);
        else return "";
    }

    public Integer getPriority(){
        return this.priority;
    }

    public String getPriorityString(){
        if (this.priority == 1) return "UPPER";
        else if (this.priority == 2) return "Middle";
        else return "Lower";
    }
    
    @Override
    public String toString(){
        return String.format("id-%d:\t%s\t%s", id, getCreateString(), name);
    }

    @Override
    public int compareTo(Object o){
        if ((this.priority == (((Task) o).getPriority()))) return this.compareTo(o);
        if (this.priority == 1) return -1;
        else if (((Task) o).getPriority() == 1) return 1;
        else if (this.deadLineDateTime.compareTo(((Task)o).getDead()) == 0) return this.priority.compareTo(((Task) o).getPriority());
        else return (this.deadLineDateTime.compareTo(((Task)o).getDead()));
    }

    @Override
    public boolean hasNext() {
        return index++ < 7;
    }

    @Override
    public String next() {
        switch (index) {
            case 1:
                return String.format("%s", id);
            case 2:
                return String.format("%s", getCreateString());
            case 3:
                return String.format("%s", name);
            case 4:
                return String.format("%s", getPriorityString());
            case 5:
                return String.format("%s", getDeadString());
            default:
                return String.format("%s", getCompletedDateTime());
        }
    }

    @Override
    public boolean equals(Object o){
        if ((this.priority == ((Task)o).getPriority()) && 
        (this.name.equals(((Task)o).name)) &&
        (this.deadLineDateTime.equals(((Task)o).getDead())) &&
        (this.deadLineDateTime != null))
        return true;
        else return false;
    }

}