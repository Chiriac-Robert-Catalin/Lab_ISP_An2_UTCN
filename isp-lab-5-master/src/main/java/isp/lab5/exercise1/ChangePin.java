package isp.lab5.exercise1;

public class ChangePin extends Transaction {
    public String oldPin;
    public String newPin;
    public ChangePin(String oP,String nP,Account cont)
    {
        super(cont);
        this.oldPin=oP;
        this.newPin=nP;
    }

    @Override
    public String execute() {
        if(oldPin==account.getCard().getPin())
        {
            account.getCard().setPin(newPin);
            return "Changed PIN";
        }
        else
        {
            return "Wrong Pin";
        }
    }
}
