import java.util.ArrayList;

enum SearchRe {
    grandParent,
    grandChildren,
}

enum SearchAge {
    ageYounger,
    ageOlder
}

public class Research {
    ArrayList<Person> result = new ArrayList<>();
    ArrayList<Node> tree;

    public Research(GeoTree geoTree) {
        tree = geoTree.getTree();
    }

    public String getResult(){
        StringBuilder names = new StringBuilder();
        for (Person t : this.result) names.append(t.getFullName());
        return names.toString();
    }

    public ArrayList<Person> spend(Person p, Relationship re) {
        for (Node t : tree) {
            if (t.p1.getFullName() == p.getFullName() && t.re == re && !this.result.contains(t.p1)) {
                result.add(t.p2);
            }
        }
        return result;
    }

    public ArrayList<Person> spend(Person p, SearchRe re){
        Relationship reTemp = Relationship.parent;
        if (re == SearchRe.grandParent) reTemp = Relationship.parent;
        if (re == SearchRe.grandChildren) reTemp = Relationship.children;
        ArrayList<Person> resultTemp = new ArrayList<Person>(spend(p, reTemp));
        this.result.clear();
            for (Person q: resultTemp) spend(q, reTemp);
        return result;
    }

    public ArrayList<Person> spend(SearchAge re, int ageRe){
        for (Node t : tree) {
            if (re == SearchAge.ageOlder) if (t.p1.getAge() >= ageRe && !this.result.contains(t.p1)) result.add(t.p1);
            if (re == SearchAge.ageYounger) if (t.p1.getAge() <= ageRe && !this.result.contains(t.p1)) result.add(t.p1);
        }
            return result;
    }

    public ArrayList<Person> spend(Gender ge){
        for (Node t : tree) {
            if (t.p1.getGender() == ge.toString() && !this.result.contains(t.p1)) result.add(t.p1);
        }
            return result;
    }

    public ArrayList<Person> spend(GeoTree ge){
        for (Node t : tree) {
            if (!this.result.contains(t.p1)) result.add(t.p1);
        }
            return result;
    }

}