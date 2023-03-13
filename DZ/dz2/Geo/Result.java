import java.util.HashSet;

import Interface.Printable;

public class Result implements Printable{
    
    HashSet<Person> result = new HashSet<>();

    public void print(){
        System.out.println(result);
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


}
