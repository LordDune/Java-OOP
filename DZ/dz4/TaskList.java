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

    public void addd(String name, Integer y, Integer m, Integer d, Integer h){
        MiddleTask task = new MiddleTask(name, y, m, d, h);
        list.add(task);
    }

    public void addd(String name, Integer y, Integer m, Integer d){
        LowerTask task = new LowerTask(name, y, m, d);
        list.add(task);
    }

    public ArrayList<Task> getList(){
        return this.list;
    }

    public void print(){
        System.out.println("ID\t\tCreateDate\tCreateTime\tCreator\t\tPriority\tDeadLineDate\tDeadLineTime");
        for (Task i: list){
            System.out.println(i);
        }
    }
}
