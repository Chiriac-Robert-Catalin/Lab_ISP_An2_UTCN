package isp.lab6.exercise4;

public class Card {
    private String cardID;
    private String pin;

    public Card(String Id,String p){
        this.cardID=Id;
        this.pin=p;
    }
    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }
}
