package isp.lab5.exercise1;


import java.util.ArrayList;


public class Exercise1 {

    public static void main(String[] args) {
       Card cac1 = new Card("1234","0000");
       Account ac1 = new Account("Marcel",5.00,cac1);
       Card cac2 = new Card("2345","0001");
       Account ac2 = new Account("Floricica",10.00,cac2);
       Card cac3 = new Card("0123","3456");
       Account ac3 = new Account("Dorel",2.00,cac3);
       Account[] ListaCont = new Account[10];
       ListaCont[0]=ac1;
       ListaCont[1]=ac2;
       ListaCont[2]=ac3;
        Bank ING = new Bank(ListaCont);
        ATM INGatm=new ATM(ING);
        INGatm.insertCard(cac1,"0000");
        INGatm.CheckMoney();
    }
}
