package DZ.dz5;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Controller{

    
    Scan scan = new Scan();
    Menu menu = new Menu();
    private static Logger log = Logger.getLogger(Controller.class.getName());
    

    public void startCalc(){
        Boolean isStart = true;
       
            while (isStart){
                try {
                switch (menu.mainMenu()){
                    case "1":
                        ModelReal real = new ModelReal();
                        real.setOne();
                        if ("+-*/".contains(real.setOp())){
                            real.setTwo();
                            real.setResult();
                            real.showResult();
                        }
                        else menu.error();
                        break;
                    case "2": 
                        ModelComplex complex = new ModelComplex();
                        complex.setOne();
                        if ("+-*/".contains(complex.setOp())){
                            complex.setTwo();
                            complex.setResult();
                            complex.showResult();
                        }
                        else menu.error();
                        break;
                    default:
                        isStart = false;
                        break;
                }
            }
            catch (Exception ex) {
                log.log(Level.SEVERE, "Exception: ", ex);
                scan.getStr("Неверный ввод\n");
            }

    }
}
}
    
    
