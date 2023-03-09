package isp.lab6.exercise4;

abstract public class Transaction {
    protected Account account;
    public Transaction(Account cont){
        this.account=cont;
    }
    abstract public String execute();

}
