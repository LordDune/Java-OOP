import Interface.Printable;

public class Node implements Printable {

    public Node(Person p1, Relationship re, Person p2) {
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;
    }

    Person p1;
    Relationship re;
    Person p2;

    // @Override
    // public String toString() {
    //     return String.format("%s: %s -> %s", p1, re, p2);
    // }
    public void print(){
        System.out.println(String.format("%s: %s -> %s", p1, re, p2));
    }

}
