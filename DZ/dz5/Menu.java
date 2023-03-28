package DZ.dz5;



public class Menu {



    public String mainMenu(){
        System.out.println("""
            ------------------------ МЕНЮ ---------------------------
            1. Операции с действительными числами
            2. Операции с комплексными числами
            """);
            return new Scan().getStr("Выберите пункт меню или нажмите любой символ для выхода: ");
    }

    public void error(){
        System.out.println("Неверный ввод\n");
    }




    
}
