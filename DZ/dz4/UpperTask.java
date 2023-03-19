package DZ.dz4;

public class UpperTask extends Task{
    
    UpperTask(String name){
       super(name); 
       priority = 1;
    }

    @Override
    public String toString() {
        return String.format("%s\t\tUPPER\t\tdo it NOW!\t", super.toString());
    }

    @Override
    public int compareTo(Object o) {
        if ((this.priority == (((Task) o).getPriority()))) return (this.getCreate().compareTo(((UpperTask)o).getCreate()));
        else return super.compareTo(o);
    }
}
    
