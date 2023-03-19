package DZ.dz4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CSVFile {
    
public CSVFile (ArrayList<Task> list){
    StringBuilder sb = new StringBuilder();
    try (PrintWriter writer = new PrintWriter(new File("result.csv"))) {
        
        for (Task task : list){
        while (task.hasNext()){
            sb.append(task.next());sb.append(";");
        }
        sb.append("\n");
        }
        writer.write(sb.toString());
        writer.close();
        System.out.println("Файл записан");
    }
    catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    }

}


public void readCSVFile(){
    List<List<String>> records = new ArrayList<>();
    try (Scanner scanner = new Scanner(new File("result.csv"));) {
        while (scanner.hasNextLine()) {
            records.add(getRecordFromLine(scanner.nextLine()));
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    for (List<String>  list: records){
            
            System.out.print(String.format("id-%s:\t%s\t%s\t\t%s\t\t%s\t%s\n",  list.get(0), 
                                                                                    list.get(1), 
                                                                                    list.get(2), 
                                                                                    list.get(3), 
                                                                                    list.get(4), 
                                                                                    list.get(5)));
        }
        System.out.println("Файл прочитан");
}
private List<String> getRecordFromLine(String line) {
    List<String> values = new ArrayList<String>();
    try (Scanner rowScanner = new Scanner(line)) {
        rowScanner.useDelimiter(";");
        while (rowScanner.hasNext()) {
            values.add(rowScanner.next());
        }
    }
    return values;
}

}

