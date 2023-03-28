package DZ.dz5;

public class ModelComplex extends Model {
    
    CalcComplexNumbers calc = new CalcComplexNumbers();

    ComplexNumber one;
    ComplexNumber two;
    ComplexNumber result;
    Scan scan = new Scan();

    public void setOne(){
        this.one = new ComplexNumber(scan.getValue("Введите действительную часть первого числа: "), scan.getValue("Введите мнимую часть первого числа: "));
    }

    public void setTwo(){
        this.two = new ComplexNumber(scan.getValue("Введите действительную часть второго числа: "), scan.getValue("Введите мнимую часть второго числа: "));
    }

    public void setResult(){
        this.result = calc.operation(this.op, this.one, this.two);
    }

    public void showResult(){
        System.out.println(String.format("%s %s %s = %s\n", this.one, this.op, this.two, this.result));
    }
}


