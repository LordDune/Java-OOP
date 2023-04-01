package DZ.dz7;

import DZ.dz7.Interfaces.Call;

public abstract class Phone implements Call<Phone> {
    
    String name;

    State state;

    enum State {
        On,
        Off
    }

    public Phone(String name){
        this.name = name;
    }

    public void On(){
        this.state = State.On;
    }

    public void Off(){
        this.state = State.Off;
    }

    public Boolean getState(){
        return (this.state == State.On);
    }

    public void getStateMes(){
        if (this.state == State.On) System.out.println(this.name + " включен");
        else System.out.println(this.name + " выключен");
    }

    public String getName(){
        return this.name;
    }

    public void call(Phone phone){
        if (getState()){
            if (phone instanceof Call){
                System.out.printf("%s звонит %s\n", this.name, phone.getName());
                ((Call) phone).getCall(this);
            }
            else System.out.printf("%s не может принимать звонки", phone.getName());
        }
        else this.getStateMes();
    }

}
