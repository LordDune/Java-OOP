import java.util.Comparator;

public abstract class PersonComparator implements Comparator<Person> {


}

class AgeComparator extends PersonComparator {

    @Override
public int compare(Person p1, Person p2) {
    return Integer.compare(p1.getAge(), p2.getAge());
}
}

class GenderComparator extends PersonComparator {

    @Override
public int compare(Person p1, Person p2) {
    return p1.getGender().compareTo(p2.getGender());
}
}
