package DZ.dz4;
import java.util.Collections;
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {   
        
        TaskList list = new TaskList(); // создание списка задач, ниже создае задачи и добавляем в список
        list.add("Sergey", "15.12.2023"); // создание задачи нисшего приоритета - указываем имя и дату выполнения
        list.add("Sergey", "15.12.2023", 15); // создание задачи среднего приоритета - указываем дату и час выполнения
        list.add("Sergey", "15.10.2023", 12);
        list.add("Sergey", "13.10.2023");
        list.add("Sergey", "13.10.2023");
        list.add("Sergey"); // создание задачи наивысшего приоритета - указываем только имя, задача должна быть выполнена немедленно
        list.add("Sergey"); 
        System.out.println("До сортировки. Выводятся в порядке записи\n");
        list.showTask(); // вывод актуальных задач
        Collections.sort(list.getActual()); // сортировка
        CSVFile d = new CSVFile(list.getActual()); // запись в файл
        System.out.println();
        System.out.println("После сортировки. Сортируются по приоритету и дате выполнения\n");
        list.showTask(); // вывод актуальных задач после сортировка
        list.del(1); // выполнение задачи по ID - переносится в список выполненных, проставляется дата и время выполнения
        list.del(5); // выполнение задачи по ID
        list.del(3); // выполнение задачи по ID
        list.showTask(); // вывод актуальных задач после удаления выполненных
        list.showCompleted(); // вывод списка выполненных задач
        
        d.readCSVFile(); // вывод перечня из файла
        
        boolean q = list.getid(4).equals(list.getid(5)); // сравнение задач
        System.out.println(q);
        

 
    }
}
