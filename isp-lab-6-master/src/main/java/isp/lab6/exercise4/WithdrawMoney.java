package isp.lab6.exercise4;

public class WithdrawMoney extends Transaction {
    public double amount;



    public WithdrawMoney(double amounts,Account cont){
        super(cont);
        this.amount=amounts;
    }

    @Override
    public String execute() {
        if(account.getBalance()>=amount)
        {
            account.setBalance(account.getBalance()-amount);
            return "Job done!";
        }
        else
            return "Not enough money";

    }
}
