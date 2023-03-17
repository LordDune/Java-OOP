package DZ.dz4;

public class UpperTask extends Task{
    
    UpperTask(String name){
       super(name); 
    }

    @Override
    public String toString() {
        return String.format("%s\tUPPER\t\tdo it NOW!", super.toString());
    }

    // @Override
    // public int compareTo(Object o) {
    //     if (this.getClass() == o.getClass()){
    //         return this.getCreateTime().compareTo(((UpperTask)o).getCreateTime());
    //     }
    //     else return 1;
    //     }
    }
    
