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

    public void addd(String name, String deadLineDateTime, int hours){
        MiddleTask task = new MiddleTask(name, deadLineDateTime, hours);
        list.add(task);
    }

    public void addd(String name, String deadLineDate){
        LowerTask task = new LowerTask(name, deadLineDate);
        list.add(task);
    }

    public ArrayList<Task> getList(){
        return this.list;
    }

    public void print(){
        System.out.println("ID\t\tCreate Date\t\tCreator\t\tPriority\tDeadLine");
        for (Task i: list){
            System.out.println(i);
        }
    }
}
