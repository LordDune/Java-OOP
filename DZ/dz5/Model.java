package DZ.dz5;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract class Model<T> {
    
    NumberFormat nf = new DecimalFormat("#.############");
    
    T one;
    T two;
    T result;
    String op;
    Scan scan = new Scan();

    public String setOp(){
        this.op = scan.getOp();
        return op;
    }
}
