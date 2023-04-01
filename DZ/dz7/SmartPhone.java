package DZ.dz7;

import java.util.HashSet;

import DZ.dz7.Interfaces.Apps;

public class SmartPhone extends MobilePhone implements Apps<Phone>  {
    
    HashSet<String> apps = new HashSet();
    
    public SmartPhone(String name){
        super(name);
    }

    public void instApp(String appName){
        if (getState()) {
            if (!apps.contains(appName)) {
                apps.add(appName);
                System.out.printf("%s: приложение %s установлено\n", this.name, appName);
            } 
            else System.out.printf("%s: приложение %s уже установлено\n", this.name, appName);
        }
        else this.getStateMes();
}

    public void delApp(String appName){
        if (getState()) {
            if (apps.contains(appName)) {
                apps.remove(appName);
                System.out.printf("%s: приложение %s удалено\n", this.name, appName);
            } 
            else System.out.printf("%s: приложение %s отсутствует\n", this.name, appName);
        }
        else this.getStateMes();
    }

    public HashSet getApps(){
        return this.apps;
    }

    public void sendMesApp(Phone phone, String appName, String message){
        if (getState()){
            if (this.apps.contains(appName)){
                if (phone instanceof Apps){
                    if (((Apps)phone).getApps().contains(appName)){
                        System.out.printf("%s: отправлено сообщение %s через приложение %s\n", this.name, phone.getName(), appName);
                        ((Apps)phone).getMesApp(this, appName, message);
                    }
                    else System.out.printf("%s: у пользователя %s не установлено приложение %s\n", this.name, phone.getName(), appName);
                }
                else System.out.printf("%s: устройство пользователя %s не поддерживает приложения\n", this.name, phone.getName(), appName);
            }
            else System.out.printf("%s: приложение %s не установлено\n", this.name, appName);
        }
        else this.getStateMes();
    }

    public void getMesApp(Phone phone, String appName, String message){
        System.out.printf("%s: получено сообщение от %s через приложение %s: %s\n", this.name, phone.getName(), appName, message);
    }
}
