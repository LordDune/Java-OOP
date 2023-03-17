package DZ.dz4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Main {

    public static void main(String[] args) {
        
        TaskList list = new TaskList();
        Random w = new Random();

        list.addd("Sergey", w.nextInt(1000));
        list.addd("Sergey", 500);
        list.addd("Sergey", 500, 14);
        list.addd("Sergey", w.nextInt(1000), 10);
        list.addd("Sergey");
        list.addd("Sergey");
        System.out.println("До сортировки");
        
        list.print();
        Collections.sort(list.getList());
        System.out.println("После сортировки");
        list.print();
    }
}
