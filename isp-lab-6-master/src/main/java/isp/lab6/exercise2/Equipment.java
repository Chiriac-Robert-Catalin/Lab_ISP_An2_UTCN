package isp.lab6.exercise2;


public class Equipment {
    private String name;
    private String serialNumber;
    private String owner;
    private boolean taken;

    public Equipment(String serialNumber) {

        this.name=null;
        this.serialNumber=serialNumber;
        this.owner=null;
        this.taken=false;
    }

    public Equipment(String name, String serialNumber) {
        this.name=name;
        this.serialNumber=serialNumber;
        this.taken=false;
        this.owner=null;
    }

    public Equipment(String name, String serialNumber, String owner) {
        this.name=name;
        this.serialNumber=serialNumber;
        this.owner=owner;
        this.taken=true;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isTaken() {
        return taken;
    }

    /**
     * Provide the owner of the equipment
     * Equipment should be set as taken
     *
     * @param owner - owner name
     */
    public void provideEquipmentToUser(final String owner) {
        this.setOwner(owner);
        this.setTaken(true);
    }

    /**
     * Equipment is returned to the office
     * Equipment should not be set as taken
     * Remove the owner
     */
    public void returnEquipmentToOffice() {

        this.setOwner(null);
        this.setTaken(false);
    }
}
