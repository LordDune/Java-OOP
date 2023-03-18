package DZ.dz4;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

import javax.annotation.processing.SupportedOptions;


public class Main {

    public static void main(String[] args) {
        
        TaskList list = new TaskList();
        Random w = new Random();

        list.addd("Sergey", 2023, 04, 15, 12);
        list.addd("Sergey", 2023, 04, 15);
        list.addd("Sergey", 2023, 04, 15, 15);
        list.addd("Sergey",  2023, 05, 15);
        list.addd("Sergey");
        list.addd("Sergey");
        System.out.println("До сортировки\n");
        
        list.print();
        // Collections.sort(list.getList());
        // System.out.println();
        // System.out.println("После сортировки\n");
        // list.print();
        // Calendar calendar = new GregorianCalendar(2023,03,18);
        // System.out.println(calendar.getTime());
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
