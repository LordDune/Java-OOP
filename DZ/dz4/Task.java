package DZ.dz4;

import java.util.Random;

public class Task implements Comparable{

    private Integer createTime;
    private String name;
    private Integer id;
    private static Integer count = 0;
    Random w = new Random();
    

    public Task(String name){
        this.id = ++count;
        this.createTime = w.nextInt(1000); //нужно исправить на реальную дату и время
        this.name = name;
    }

    public Integer getCreateTime(){
        return this.createTime;
    }
    
    
    @Override
    public String toString(){
        return String.format("id-%d:\t\t%s\t\t%s\t", id, createTime, name);
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

