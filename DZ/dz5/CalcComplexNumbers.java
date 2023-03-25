package DZ.dz5;

public class CalcComplexNumbers implements CalcInterface<ComplexNumber> {
    
    public ComplexNumber sum(ComplexNumber a, ComplexNumber b) {
        return new ComplexNumber(a.getA() + b.getA(), a.getB() + b.getB());
    }

    public ComplexNumber diff(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.getA() - b.getA(), a.getB() - b.getB());
    }

    public ComplexNumber mult(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber(a.getA() * b.getA() - a.getB() * b.getB(), a.getA() * b.getB() + a.getB() * b.getA());
    }

    public ComplexNumber div(ComplexNumber a, ComplexNumber b){
        return new ComplexNumber((a.getA()*b.getA() + a.getB()*b.getB()) / (b.getA()*b.getA() + b.getB()*b.getB()), 
                                (b.getA()*a.getB() - a.getA()*b.getB()) / (b.getA()*b.getA() + b.getB()*b.getB()));
    }

    public ComplexNumber operation(String op, ComplexNumber a, ComplexNumber b){
        if (op.equals("+")) return this.sum(a, b);
        else if (op.equals("-")) return this.diff(a, b);
        else if (op.equals("*")) return this.mult(a, b);
        else return this.div(a, b);
    }
}
