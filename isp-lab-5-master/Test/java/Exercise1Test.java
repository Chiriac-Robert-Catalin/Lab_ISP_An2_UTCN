import isp.lab5.exercise1.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
public class Exercise1Test {



    @Test
    public void TestCheckMoney()
    {
        Card cac1 = new Card("1234","0000");
        Account ac1 = new Account("Marcel",5.00,cac1);

        Account[] ListaCont = new Account[10];
        ListaCont[0]=ac1;
        Bank ING = new Bank(ListaCont);
        ATM INGatm=new ATM(ING);
        INGatm.insertCard(cac1,"0000");
        INGatm.CheckMoney();
        Transaction t= new CheckMoney(ING.getAccountByCardID(INGatm.card.getCardID()));
        Assert.assertEquals("These values should be equal","You have 5.0 lei",t.execute());
    }
    @Test
    public void TestWithdrawMoney()
    {
        Card cac1 = new Card("1234","0000");
        Account ac1 = new Account("Marcel",5.00,cac1);

        Account[] ListaCont = new Account[10];
        ListaCont[0]=ac1;
        Bank ING = new Bank(ListaCont);
        ATM INGatm=new ATM(ING);
        INGatm.insertCard(cac1,"0000");
        INGatm.WithdrawMoney(3.0);
        Transaction t= new WithdrawMoney(3.0,ING.getAccountByCardID(INGatm.card.getCardID()));
        Assert.assertEquals(2.0,ac1.getBalance(),0);
    }
    @Test
    public void TestChangePin()
    {
        Card cac1 = new Card("1234","0000");
        Account ac1 = new Account("Marcel",5.00,cac1);

        Account[] ListaCont = new Account[10];
        ListaCont[0]=ac1;
        Bank ING = new Bank(ListaCont);
        ATM INGatm=new ATM(ING);
        INGatm.insertCard(cac1,"0000");
        INGatm.ChangePin("0000","1234");
        Transaction t= new ChangePin("0000","1234",ING.getAccountByCardID(INGatm.card.getCardID()));
        Assert.assertEquals("1234",INGatm.card.getPin() );
    }
}
