package isp.lab4.exercise6;

public class Exercise6 {
    public static void main(String args[]) {
        CommisionEmployee Baiatucucomision = new CommisionEmployee("Gigel", "Florin", 69.420, 420.69);
        System.out.println(Baiatucucomision.getFirstName()+"  "+Baiatucucomision.getLastName());
        System.out.println(Baiatucucomision.getPaymentAmount() );
        HourlyEmployee Fatacumatura = new HourlyEmployee("Dansatoarea","Floricica",5.0,10.0);
        System.out.println(Fatacumatura.getFirstName()+" "+Fatacumatura.getLastName());
        System.out.println(Fatacumatura.getPaymentAmount());
        SalariedEmployee Aladelabirou = new SalariedEmployee("Cui","Pasa?",50.0);
        System.out.println(Aladelabirou.getFirstName()+" "+Aladelabirou.getLastName());
        System.out.println(Aladelabirou.getPaymentAmount());
        Employee[] Angajati = new Employee[6];
        Angajati[0]=new CommisionEmployee("Marcel","David",5,5);
        Angajati[1]=new CommisionEmployee("Ioana","Maria",4,6);
        Angajati[2]=new HourlyEmployee("Fata","Matura",20,7);
        Angajati[3]=new HourlyEmployee("Baiatu","Vopseste",15,9);
        Angajati[4]=new SalariedEmployee("Baiatu","Lacostum",8000);
        Angajati[5]=new SalariedEmployee("Fata","Lacravata",7999);
        for(int i=0;i<6;i++)
        {
            System.out.println(Angajati[i].getFirstName()+" "+Angajati[i].getLastName());
            System.out.println(Angajati[i].getPaymentAmount());
        }
    }
}
