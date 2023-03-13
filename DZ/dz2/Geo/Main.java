

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
        
        // реализация поисков
        // print(gt, vasya, Relationship.husband); // кому является вася мужем
        // print(gt, irina, Relationship.parent); // кому является ирина родителем
        // print(gt, masha, SearchRe.grandParent); // кому является ирина бабушкой
        // print(gt, masha, Relationship.parent); // кому является ирина родителем
        // print(gt, ivan, SearchRe.grandChildren); // кому является иван внуком
        // print(gt, jane, SearchRe.grandChildren); // кому является женя внучкой
        // print(gt, SearchAge.ageYounger, 40); // все люди до 40 лет
        // print(gt, SearchAge.ageOlder, 40); // все люди от 40 лет
        // print(gt, Gender.Male); // все люди мужского пола
        // print(gt, Gender.Female); // все люди женского пола
        
        //реализация интерфейса Printable
        gt.print(); // вывод информации о персонаже
        irina.print(); // вывод информации о древе
        new Result(gt, vasya, Relationship.husband).print(); // вывод информации об исследовании
        new Result(gt, masha, SearchRe.grandParent).print(); // вывод информации об исследовании
        new Result(gt, SearchAge.ageYounger, 40).print(); // вывод информации об исследовании
        new Result(gt, Gender.Female).print(); // вывод информации об исследовании
    }

   }