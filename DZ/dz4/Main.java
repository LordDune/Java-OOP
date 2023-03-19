package DZ.dz4;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        
        TaskList list = new TaskList();   
        list.add("Sergey", "15.12.2023"); // создание задачи нисшего приоритета - указываем дату
        list.add("Sergey", "15.12.2023", 15); // создание задачи среднего приоритета - указываем дату и время
        list.add("Sergey", "15.10.2023", 12);
        list.add("Sergey", "13.10.2023");
        list.add("Sergey"); // создание задачи наивысшего приоритета - указываем только имя
        list.add("Sergey"); 
        System.out.println("До сортировки\n");
        list.showTask();
        Collections.sort(list.getActual());
        System.out.println();
        System.out.println("После сортировки\n");
        list.showTask();
        list.del(1);
        list.del(5);
        list.showTask();
        list.showCompleted();

        
        // LocalDate date = LocalDate.of(2023,5,12);
        // date.plusDays(5);
        // System.out.println(date.plusDays(5));
        // LocalDate datenow = LocalDate.now();
        // System.out.println(datenow);
        // LocalTime timenow = LocalTime.now();
        // System.out.println(timenow);
        // ArrayList<LocalDate> list = new ArrayList();
        // list.add(date);
        // list.add(datenow);
        // list.add(timenow);
        // System.out.println(list);


      
    }
}
