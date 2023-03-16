import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import Interface.Printable;

enum p {
    age,
    gender
}

public class Result implements Printable{


    
    ArrayList<Person> result = new ArrayList<>();

    public void sort(p format){
        if (format == p.age) Collections.sort(this.result, new AgeComparator());
        else if (format == p.gender) Collections.sort(this.result, new GenderComparator());
    }

    public void print(){
        System.out.println(result);
        System.out.println();
    }

    public void print(p format){
        sort(format);
        print();
    }

    public void printSave(String fileName){
        print();
        try (FileWriter fw = new FileWriter(fileName, false)) { // sfalse - создание и перезапись
            for (Person i: result) fw.write(i + "\n");
            
        }
        catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    
    public void printSave(p format){
        sort(format);
        printSave();
    }

    public void printSave(){
        printSave("result.txt");
    }

    public void printSave(p format, String fileName){
        sort(format);
        printSave(fileName);
    }

    public Result(GeoTree tree, Person name, Relationship re) {
        System.out.printf("%s - %s по отношению к: ", name, re.toString());
        this.result = new Research(tree).spend(name,re);
    }

    public Result(GeoTree tree, Person name, SearchRe re) {
        String st = "";
        if (re == SearchRe.grandParent) {
            if (name.getGender() == "Female") st = "GrandMother";
            else if (name.getGender() == "Male") st = "GrandFather";
            }
        else if (re == SearchRe.grandChildren) {
            if (name.getGender() == "Male") st = "GrandSon";
            else if (name.getGender() == "Female") st = "GrandDaughter";
        }
        System.out.printf("%s - %s по отношению к: ", name, st);
        this.result = new Research(tree).spend(name,re);
    }

    public Result(GeoTree tree, SearchAge se, int age) {
        String st = "";
        if (se == SearchAge.ageYounger) st = "до";
        else if (se == SearchAge.ageOlder) st = "от";
        System.out.printf("Люди %s %d: ", st, age);
        this.result = new Research(tree).spend(se, age);
    }

    public Result(GeoTree tree, Gender ge){
        System.out.printf("Выводим всех %s: ", ge);
        this.result = new Research(tree).spend(ge);
    }

    public Result(GeoTree tree){
        System.out.printf("Выводим всех членов семьи: ");
        this.result = new Research(tree).spend(tree);
    }

}
