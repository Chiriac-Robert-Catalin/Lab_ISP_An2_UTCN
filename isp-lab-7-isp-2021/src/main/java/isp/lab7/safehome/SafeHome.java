package isp.lab7.safehome;

public class SafeHome {

    public static void main(String[] args) {
        Door door1 = new Door(DoorStatus.OPEN);
        DoorLockController ctrl = new DoorLockController(door1);
            try {
                ctrl.addTenant("1234", "User1");
            } catch (Exception ex) {
                System.out.println("eroare de citire:"+ex);
            }

            int errCount = 0;
            for (int i = 0; i < 2; i++) {
                try {
                    ctrl.enterPin("4532");

                } catch (Exception e) {
                    System.out.println("eroare de introducere pin "+i+" "+e);
                }
            }//.for


            // too many attempts exception with wrong pin
            try {
                ctrl.enterPin("4532");

            } catch (Exception e) {
                System.out.println("eroare de introducere pin gresit,prea multe pin:"+e);
            }
            try {
                ctrl.enterPin("1234");
            } catch (Exception e) {
                System.out.println("eroare de introducere pin corect, prea multe pin:"+e);
            }
            try{
                ctrl.enterPin(ControllerInterface.MASTER_KEY);
            }
            catch (Exception e){
                System.out.println("eroare introducere master key"+e);
                System.out.println("nr attempt:"+ctrl.attempts);

            }
            System.out.println("nr attempt:"+ctrl.attempts);

        try {
            ctrl.addTenant("12345", "User1");
        } catch (Exception ex) {
            System.out.println("eroare add:"+ex);
        };
        try {
            ctrl.removeTenant("User1");
            ctrl.enterPin("12345");

        } catch (Exception ex) {
            System.out.println("eroare remove:"+ex);
        }
    }
    }

