package isp.lab5.exercise1;

public class Bank {
    public Account[] ListaCont;
    public Bank(Account[] Ilistacont)
    {
        this.ListaCont=Ilistacont;
    }
    public String executeTransaction(Transaction t)
    {
        return t.execute();
    }

    public Account getAccountByCardID(String CardID)
    {
        int i;
        for(i=0;i< ListaCont.length;i++)
        {
            if(CardID.equals(ListaCont[i].card.getCardID()))
                return ListaCont[i];
        }
        return null;
    }
}
