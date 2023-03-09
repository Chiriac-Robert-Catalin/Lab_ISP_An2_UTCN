package isp.lab4.exercise2;

public class FireAlarm {
    private boolean active;
    public FireAlarm(boolean activ){
        this.active=activ;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "FireAlarm{" +
                "active=" + active +
                '}';
    }
}
