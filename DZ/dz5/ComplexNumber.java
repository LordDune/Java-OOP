package DZ.dz5;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ComplexNumber{
    
    Double a;
    Double b;
    NumberFormat nf = new DecimalFormat("#.############");

    public ComplexNumber(Double a, Double b){
        this.a = a;
        this.b = b;
    }

    public Double getA(){
        return this.a;
    }

    public Double getB(){
        return this.b;
    }

    public String printA(){
        if (a != 0) return String.format("%s", nf.format(a).toString());
        else return "";
    }

    public String printB(){
        StringBuilder str = new StringBuilder("");
        if (this.b != 0){
            if (this.a != 0 && this.b > 0) str.append("+");
            else if (this.b < 0) str.append("-");
            if (Math.abs(this.b) != 1) str.append(nf.format(Math.abs(this.b))).append("i");
            else str.append("i");
        }
        return str.toString();
    }

    @Override
    public String toString() {
        return String.format("%s%s", this.printA(), this.printB());
    }
}

