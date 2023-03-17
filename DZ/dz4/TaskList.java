package DZ.dz4;

import java.util.ArrayList;

public class TaskList {

    private ArrayList<Task> list = new ArrayList<>();

    public void addd(Task task){
        list.add(task);
    }

    public void addd(String name){
        UpperTask task = new UpperTask(name);
        list.add(task);
    }

    public void addd(String name, Integer deadLineTime, Integer hours){
        MiddleTask task = new MiddleTask(name, deadLineTime, hours);
        list.add(task);
    }

    public void addd(String name, Integer deadLineTime){
        LowerTask task = new LowerTask(name, deadLineTime);
        list.add(task);
    }

    public ArrayList<Task> getList(){
        return this.list;
    }

    public void print(){
        for (Task i: list){
            System.out.println(i);
        }
    }
}
