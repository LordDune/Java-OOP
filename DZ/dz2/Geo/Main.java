

public class Main  {

    public static void main(String[] args) {
        
        // создание персонажей
        Person masha = new Person("Маша", 60, "Female");
        Person toma = new Person("Тома", 65, "Female");
        Person irina = new Person("Ирина", 40, "Female");
        Person vasya = new Person("Вася", 42, "Male");
        Person jane = new Person("Женя", 10, "Female");
        Person ivan = new Person("Ваня", 20, "Male");
        // создание дерева
        GeoTree gt = new GeoTree();
        
        // наполнение дерева связями
        gt.append(masha, Relationship.parent, irina, Relationship.children);
        gt.append(toma, Relationship.parent, vasya, Relationship.children);
        gt.append(irina, Relationship.wife, vasya, Relationship.husband);
        gt.append(irina, Relationship.parent, jane, Relationship.children);
        gt.append(irina, Relationship.parent, ivan, Relationship.children);
        
        //реализация интерфейса Printable
        gt.print(); // вывод информации о персонаже
        irina.print(); // вывод информации о древе
        new Result(gt, vasya, Relationship.husband).print(); // вывод информации об исследовании
        new Result(gt, masha, SearchRe.grandParent).print(); // вывод информации об исследовании
        new Result(gt, SearchAge.ageYounger, 40).print(); // вывод информации об исследовании
        new Result(gt, Gender.Female).print(); // вывод информации об исследовании
    }

   }