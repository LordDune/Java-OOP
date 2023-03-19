package DZ.dz4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class TaskList {

    private ArrayList<Task> actual = new ArrayList<>();
    private ArrayList<Task> completed = new ArrayList<>();

    public void add(Task task){
        actual.add(task);
    }

    public void del(int id){
        Iterator<Task> iter = this.actual.iterator();
        while (iter.hasNext()){
            Task temp = iter.next();
            if (temp.id == id) {
                iter.remove();
                completed.add(temp);
                temp.SetCompletedDateTime(LocalDateTime.now());
            }
        }
    }

    public void add(String name){
        UpperTask task = new UpperTask(name);
        actual.add(task);
    }

    public void add(String name, String deadLineDateTime, int hours){
        MiddleTask task = new MiddleTask(name, deadLineDateTime, hours);
        actual.add(task);
    }

    public void add(String name, String deadLineDate){
        LowerTask task = new LowerTask(name, deadLineDate);
        actual.add(task);
    }

    public ArrayList<Task> getActual(){
        return this.actual;
    }

    public void showTask(){
        System.out.println("Перечень актуальных задач");
        System.out.println("ID\t\tCreate Date and Time\tCreator\t\tPriority\tDeadLine");
        for (Task i: actual){
            System.out.println(i);
        }
        System.out.println();
    }

    public void showCompleted(){
        System.out.println("Перечень выполненных задач");
        System.out.println("ID\t\tCreate Date and Time\tCreator\t\tPriority\tDeadLine\t\tCompleted Date and Time");
        for (Task i: completed){
            System.out.println(String.format("%s\t\t%s", i, i.getCompletedDateTime()));
        }
        System.out.println();
    }
}
