package DZ.dz5;

public class ModelReal extends Model {
    
    CalcRealNumbers calc = new CalcRealNumbers();
    Scan scan = new Scan();

    Double one;
    Double two;
    Double result;
    
    public void setOne(){
        this.one = scan.getValue("Введите первое число: ");
    }

    public void setTwo(){
        this.two = scan.getValue("Введите второе число: ");
    }

    public void setResult(){
        this.result = calc.operation(this.op, this.one, this.two);
    }

    public void showResult(){
        System.out.println(String.format("%s %s %s = %s\n", nf.format(this.one), this.op, nf.format(this.two), nf.format(this.result)));
    }


}
