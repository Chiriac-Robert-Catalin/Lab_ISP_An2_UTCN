package isp.lab6.exercise4;

public class Account {
    private String owner;
    private double balance;
    public Card card;

    public Account(String iowner,double ibalance, Card icard)
    {
        this.owner=iowner;
        this.balance=ibalance;
        this.card=icard;
    }
    public Card getCard() {
        return card;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
