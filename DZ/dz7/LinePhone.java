package DZ.dz7;

public class LinePhone extends Phone {
    
    public LinePhone (String name){
        super(name);
    }

    public void getCall(Phone phone){
        if (getState()){
            System.out.printf("%s: входящий звонок\n", this.name);
        }
    }

}
