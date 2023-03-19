package DZ.dz4;
import java.util.Collections;


public class Main {

    public static void main(String[] args) {
        
        TaskList list = new TaskList();

        // MiddleTask task2 = new MiddleTask("Sergey", "15.02.2023 16:00");
        // LowerTask task1 = new LowerTask("Sergey", "15.02.2023 15:00");
        
        list.addd("Sergey", "15.12.2023");
        list.addd("Sergey", "15.12.2023", 15);
        list.addd("Sergey", "15.10.2023", 12);
        list.addd("Sergey", "13.10.2023");
        list.addd("Sergey");
        list.addd("Sergey");
        System.out.println("До сортировки\n");
        
        list.print();
        Collections.sort(list.getList());
        System.out.println();
        System.out.println("После сортировки\n");
        list.print();
        
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
