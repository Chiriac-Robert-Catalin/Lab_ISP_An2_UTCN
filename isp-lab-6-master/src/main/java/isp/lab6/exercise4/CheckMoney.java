package isp.lab6.exercise4;

public class CheckMoney extends Transaction {
    public CheckMoney(Account cont){
        super(cont);
    }

    @Override
    public String execute() {
        System.out.println(account.getBalance());
        return "You have "+account.getBalance()+" lei";
    }
}
