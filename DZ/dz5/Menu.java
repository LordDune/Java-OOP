package DZ.dz5;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Menu{

    NumberFormat nf = new DecimalFormat("#.############");
    Scan view = new Scan();
    private static Logger log = Logger.getLogger(Menu.class.getName());

    public void startCalc(){
        Boolean isStart = true;
       
            while (isStart){
                try {
                String str = view.getStr("1. Операции с действительными числами \n2. Операции с комплексными числами \nВыберите пункт меню или нажмите любой символ для выхода: ");
                switch (str){
                    case "1":
                        Double a = view.getValue("Введите первое число: ");
                        String op = view.getStr("Введите операцию: ");
                        if ("+-*/".contains(op)){
                            Double b = view.getValue("Введите второе число: ");
                        String result = nf.format(new CalcRealNumbers().operation(op, a, b));
                        System.out.println(String.format("%s %s %s = %s\n", nf.format(a), op, nf.format(b), result));
                        }
                        else System.out.println("Неверный ввод");
                        break;
                    case "2": 
                        Double oneA = view.getValue("Введите действительную часть первого числа: ");
                        Double oneB = view.getValue("Введите минмую часть первого числа: ");
                        ComplexNumber one = new ComplexNumber(oneA, oneB);
                        op = view.getStr("Введите операцию: ");
                        if ("+-*/".contains(op)){
                        Double twoA = view.getValue("Введите действительную часть второго числа: ");
                        Double twoB = view.getValue("Введите минмую часть второго числа: ");
                        ComplexNumber two = new ComplexNumber(twoA, twoB);
                        ComplexNumber resultComplex = new CalcComplexNumbers().operation(op, one, two);
                        System.out.println(String.format("%s %s %s = %s\n", one, op, two, resultComplex));
                        }
                        else System.out.println("Неверный ввод");
                        break;
                    default:
                        isStart = false;
                        break;
                }
            }
            catch (Exception ex) {
                log.log(Level.SEVERE, "Exception: ", ex);
                view.getStr("Неверный ввод \n");
            }

    }
}
}
    
    
