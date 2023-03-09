package isp.lab6.exercise4;

import java.util.ArrayList;

public class Bank {
    public ArrayList<Account> ListaCont;
    public Bank(ArrayList<Account> Ilistacont)
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
        for(i=0;i< ListaCont.size();i++)
        {
            if(CardID.equals(ListaCont.get(i).card.getCardID()))
                return ListaCont.get(i);
        }
        return null;
    }
}
