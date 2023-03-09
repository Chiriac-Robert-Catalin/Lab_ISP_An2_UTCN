package isp.lab6.exercise4;

public class ATM {

    public Card card;
    public Bank ING;
    public ATM( Bank ibank)
    {
        this.ING=ibank;
    }
    public void ChangePin(String oP,String nP)
    {
        if(card!=null) {
            Transaction t = new ChangePin(oP, nP, ING.getAccountByCardID(card.getCardID()));

            ING.executeTransaction(t);
        }
    }
    public void WithdrawMoney(double amount)
    {
        if(card!=null) {
            Transaction t = new WithdrawMoney(amount, ING.getAccountByCardID(card.getCardID()));
            ING.executeTransaction(t);
        }
    }
    public void CheckMoney() {
        if (card != null) {
            Transaction t = new CheckMoney(ING.getAccountByCardID(card.getCardID()));
            ING.executeTransaction(t);
        }
    }
    public boolean insertCard(Card icard,String ipin) {
        boolean adevar=false;
        if (card == null) {
            if (ipin.equals(icard.getPin())) {
                this.card = icard;
                adevar = true;
            }
        }
        return adevar;
    }
    public void removeCard(){
        this.card=null;
    }


}
