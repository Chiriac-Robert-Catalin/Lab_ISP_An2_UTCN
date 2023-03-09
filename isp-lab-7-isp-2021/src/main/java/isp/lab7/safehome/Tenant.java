package isp.lab7.safehome;

import java.util.ArrayList;

public class Tenant {
    private String name;
    public Tenant(String nume)
    {
        this.name=nume;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
