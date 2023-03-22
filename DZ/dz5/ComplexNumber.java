package DZ.dz5;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ComplexNumber {

    Double a;
    Double b;
    NumberFormat nf = new DecimalFormat("#.############");
        // System.out.printf("%s %s\n", title, nf.format(data));

    public String getA(){
        if (a != 0) return String.format("%s ", nf.format(a).toString());
        else return "";
    }

    public String getB(){
        if (b > 0 && a != 0) return String.format("+ %si", nf.format(b).toString());
        else if (b != 0) return String.format("%si", nf.format(b));
        else return "";
    }

    @Override
    public String toString() {
        return String.format("%s%s", this.getA(), this.getB());
    }

}

