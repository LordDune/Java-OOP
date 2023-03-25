package DZ.dz5;

public class CalcRealNumbers implements CalcInterface<Double> {


    public Double sum(Double a, Double b) {
        return a + b;
    }

    public Double diff(Double a, Double b){
        return a - b;
    }

    public Double mult(Double a, Double b){
        return a * b;
    }

    public Double div(Double a, Double b){
        return a / b;
    }

    public Double operation(String op, Double a, Double b){
        if (op.equals("+")) return this.sum(a, b);
        else if (op.equals("-")) return this.diff(a, b);
        else if (op.equals("*")) return this.mult(a, b);
        else return this.div(a, b);
    }
}
