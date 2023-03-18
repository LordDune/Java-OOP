package DZ.dz4;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public abstract class Task implements Comparable{

    private LocalTime createTime;
    private LocalDate createDate;
    private String name;
    private Integer id;
    private static Integer count = 0;
    

    public Task(String name){
        this.id = ++count;
        this.createDate = LocalDate.now(); 
        this.createTime = LocalTime.now().plusHours(id); //чтобы время создания у всех была разное
        this.name = name;
    }

    public String getCreateTime(){
        return this.createTime.format(DateTimeFormatter.ofPattern("hh:mm"));
    }

    public String getCreateDate(){
        return this.createDate.toString();
    }
    
    @Override
    public String toString(){
        return String.format("id-%d:\t\t%s\t%s\t\t%s\t", id, createDate, this.getCreateTime(), name);
    }

    @Override
    public int compareTo(Object o){
        if (this.getClass().getSimpleName().equals("UpperTask") && o.getClass().getSimpleName().equals("UpperTask") == false){
            return -1;
        }
        else if (this.getClass().getSimpleName().equals("UpperTask") == false && o.getClass().getSimpleName().equals("UpperTask")){
            return 1;
        }
        else if ((this.getClass().getSimpleName().equals("UpperTask") && o.getClass().getSimpleName().equals("UpperTask"))){
            return this.createTime.compareTo(((Task)o).getCreateTime());
        }
        else if(((MidLow)this).getDeadLineTime().equals(((MidLow)o).getDeadLineTime()) == false){
            return ((MidLow)this).getDeadLineTime().compareTo(((MidLow)o).getDeadLineTime());
        }
        else if (this.getClass().getSimpleName().equals("MiddleTask") && o.getClass().getSimpleName().equals("LowTask")){
            return 1;
        }
        else {
            return -1;
        }
    }
}

