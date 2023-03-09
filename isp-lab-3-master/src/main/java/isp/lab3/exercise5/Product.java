package isp.lab3.exercise5;

public class Product {
    public int id;
    public int pret;
    public String nume;
    public Product(int id,String nume, int pret)
    {
        this.id=id;
        this.nume=nume;
        this.pret=pret;
    }
    public int getId() {
        return id;
    }

    public int getPret() {
        return pret;
    }

    public String getNume() {
        return nume;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
