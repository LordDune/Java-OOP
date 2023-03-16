
public class Main  {

    public static void main(String[] args) {
        
        
        // создание дерева
        GeoTree gt = new GeoTree();
        // создание персонажей
        Person masha = new Person("Маша", 60, "Female");
        Person toma = new Person("Тома", 65, "Female");
        Person irina = new Person("Ирина", 40, "Female");
        Person vasya = new Person("Вася", 42, "Male");
        Person jane = new Person("Женя", 10, "Female");
        Person ivan = new Person("Ваня", 20, "Male");
        
        // наполнение дерева связями
        gt.append(masha, Relationship.parent, irina, Relationship.children);
        gt.append(toma, Relationship.parent, vasya, Relationship.children);
        gt.append(irina, Relationship.wife, vasya, Relationship.husband);
        gt.append(irina, Relationship.parent, jane, Relationship.children);
        gt.append(irina, Relationship.parent, ivan, Relationship.children);
        
        //реализация интерфейса Printable
        // gt.print(); // вывод информации о древе
        // irina.print(); //вывод информации о персонаже
        new Result(gt, vasya, Relationship.husband).print(); // вывод информации об исследовании
        new Result(gt, masha, SearchRe.grandParent).print(); // вывод информации об исследовании
        new Result(gt, SearchAge.ageYounger, 40).print(); // вывод информации об исследовании
        new Result(gt, Gender.Female).print(); // вывод информации об исследовании

        //реализация сортировки и записи в файл
        new Result(gt, SearchAge.ageYounger, 40).print(p.age); // сортировка результата исследования по возрасту
        new Result(gt, SearchAge.ageYounger, 40).print(p.gender); // сортировка результата исследования по полу
        System.out.println("Вывод членов семьи по возрасту");
        new Result(gt).print(p.age);
        System.out.println("Вывод членов семьи по полу");
        new Result(gt).print(p.gender);
        new Result(gt).printSave("family"); // вывод всех членов семьи и сохранение в файл family
        new Result(gt).printSave(p.age, "age"); // вывод всех членов семьи по возраству и печать в файл age
    }

   }