package DZ.dz7;

public class main {

    public static void main(String[] args) {
        
        LinePhone lp = new LinePhone("lp");
        MobilePhone mp = new MobilePhone("mp");
        SmartPhone sp1 = new SmartPhone("sp1");
        SmartPhone sp2 = new SmartPhone("sp2");
        lp.call(mp); // lp выключен
        lp.On();
        lp.call(mp); // lp звонит mp
        mp.On(); 
        lp.call(mp); // lp звонит mp -> mp: входящий звонок от lp
        mp.call(lp); // mp звонит lp -> lp: входящий звонок
        mp.sendMes(lp, "Привет"); // lp не может принимать сообщения
        sp1.On();
        sp2.On();
        mp.sendMes(sp1, "Привет"); // mp: отправлено сообщение sp1 -> sp1: входящее сообщение от mp: Привет
        sp1.instApp("Telegram"); // sp1: приложение Telegram установлено
        sp1.instApp("Telegram"); // sp1: приложение Telegram уже установлено
        sp1.sendMesApp(sp2, "Telegram", "Hi"); // sp1: у пользователя sp2 не установлено приложение Telegram
        sp2.instApp("Telegram"); // sp2: приложение Telegram установлено
        sp1.sendMesApp(sp2, "Telegram", "Hi"); // sp1: отправлено сообщение sp2 через приложение Telegram -> 
                                                                // sp2: получено сообщение от sp1 через приложение Telegram: Hi
        sp1.sendMesApp(mp, "Telegram", "Hi"); // sp1: устройство пользователя mp не поддерживает приложения
        sp1.sendMes(mp, "Привет"); // sp1: отправлено сообщение mp -> mp: входящее сообщение от sp1: Привет
        sp1.call(lp); // lp: входящий звонок
        sp1.delApp("Telegra"); //sp1: приложение Telegra отсутствует
        sp1.delApp("Telegram"); // sp1: приложение Telegram удалено
        sp2.sendMesApp(sp1, "Telegram", "Hi"); // sp2: у пользователя sp1 не установлено приложение Telegram





    }
    
}
