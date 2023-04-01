package DZ.dz7;

import DZ.dz7.Interfaces.Message;

public class MobilePhone extends Phone implements Message<Phone>{
    

    public MobilePhone (String name){
        super(name);
    }

    public void getCall(Phone phone){
        if (getState()){
            System.out.printf("%s: входящий звонок от %s\n", this.name, phone.getName());
        }
    }

    public void sendMes(Phone phone, String message){
        if (getState()){
            if (phone instanceof Message){
                System.out.printf("%s: отправлено сообщение %s\n", this.name, phone.getName());
                ((Message) phone).getMes(this, message);
            }
            else System.out.printf("%s не может принимать сообщения\n", phone.getName());
        }
        else this.getStateMes();
    }

    public void getMes(Phone phone, String message){
        if (getState()){
            System.out.printf("%s: входящее сообщение от %s: %s\n", this.name, phone.getName(), message);
        }
}

}
