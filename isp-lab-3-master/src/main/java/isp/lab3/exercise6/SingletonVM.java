package isp.lab3.exercise6;

import isp.lab3.exercise5.Product;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SingletonVM {
    private static SingletonVM single_instance = null;
    private int credit;
    private final List<Product> produse;
    private SingletonVM(List<Product> produs)
    {
        this.produse=produs;
        credit=0;
    }
    public static SingletonVM getInstance(List<Product> produs) {
        if(single_instance==null)
            single_instance = new SingletonVM(produs);
        return single_instance;
    }
    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }
    public void displayCredit(){
        System.out.println("Youar actual credit is "+this.getCredit());
    }
    public void insertCoin(int bani){
        this.setCredit(this.getCredit()+bani);
    }
    public Object displayProducts(){
        for(Product pt : this.produse){
            System.out.println("Id:"+pt.id+" Nume:"+pt.nume+" Pret:"+pt.pret);
        }
        return null;
    }
    public String selectProduct(int id){
        return produse.get(id-1).nume;
    }
    public int userMenu()
    {
        Scanner keyboard = new Scanner(System.in);
        while(true){
            System.out.println("1-display all,2-insert coin,3-select product,4-exit");
            switch (keyboard.nextInt())
            {
                case 4:
                {
                    System.out.println("Have a wonderful day!");
                    return 0;
                }
                case 3:
                {
                    System.out.println("Please enter id");
                    int id=keyboard.nextInt();
                    System.out.println("You chose:"+this.selectProduct(id));
                    System.out.println("Would you like to make a purchase?Type 1 for yes or 0 for no");
                    int buy = keyboard.nextInt();
                    if(buy==1&&this.credit>=produse.get(id-1).pret)
                    {
                        this.setCredit(this.getCredit()-produse.get(id-1).pret);
                        System.out.println("Thank you for your purchase! *Thud*");
                    }
                    else
                    if(buy==1&&this.credit<produse.get(id-1).pret)
                    {
                        System.out.println("Insufficient credit.Returning to main menu");
                    }
                    else
                    {
                        System.out.println("Returning to main menu");
                    }
                    break;
                }
                case 2:
                {
                    this.displayCredit();
                    System.out.println("Please insert the number of coins you would like to add");
                    this.insertCoin(keyboard.nextInt());
                    System.out.println("Credit updated");
                    this.displayCredit();
                    break;
                }
                case 1:
                {
                    this.displayProducts();
                    break;
                }
                default:
                {
                    System.out.println("It appears you missinput. Please enter one of the numbers shown below");
                    break;
                }
            }
        }
    }
    public static void main(String args[]){
        Product twix = new Product(1,"Twix",5);
        Product snickers = new Product(2,"Snickers",6);
        Product dorna = new Product(3,"Dorna",4);
        List<Product> produs = new ArrayList<Product>();
        produs.add(twix);
        produs.add(snickers);
        produs.add(dorna);
        SingletonVM vm1 = SingletonVM.getInstance(produs);
        SingletonVM vm2 = SingletonVM.getInstance(produs);
        SingletonVM vm3 = SingletonVM.getInstance(produs);
        System.out.println("Hashcode of vm1 is "
                + vm1.hashCode());
        System.out.println("Hashcode of vm2 is "
                + vm2.hashCode());
        System.out.println("Hashcode of vm3 is "
                + vm3.hashCode());
        if(vm1==vm2&&vm2==vm3)
            System.out.println("Cele 3 obiecte au aceeasi locatie memorie");
        else
            System.out.println("Cele 3 obiecte nu au aceeasi locatie");
    }
}

