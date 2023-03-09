package isp.lab5.exercise1;

abstract public class Transaction {
    protected Account account;
    public Transaction(Account cont){
        this.account=cont;
    }
    abstract public String execute();

}
