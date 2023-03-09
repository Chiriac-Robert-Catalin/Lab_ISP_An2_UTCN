package isp.lab6.exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class EquipmentController {
    public ArrayList<Equipment> Lista_echipamente;
    public EquipmentController()
    {
        Lista_echipamente=new ArrayList<>();
    }
    /**
     * Add new equipment to the list of equipments
     *
     * @param equipment - equipment to be added
     */
    public void addEquipment(final Equipment equipment) {
       Lista_echipamente.add(equipment);
    }

    /**
     * Get current list of equipments
     *
     * @return list of equipments
     */
    public List<Equipment> getEquipments() {

        return Lista_echipamente;
    }

    /**
     * Get number of equipments
     *
     * @return number of equipments
     */
    public int getNumberOfEquipments() {

        return Lista_echipamente.size();
    }

    /**
     * Group equipments by owner
     *
     * @return a dictionary where the key is the owner and value is represented by list of equipments he owns
     */
    public Map<String, List<Equipment>> getEquipmentsGroupedByOwner() {
        HashMap<String,List<Equipment>> OwnerGroups = new HashMap<>();
        int k=0;
        while(Lista_echipamente.size()!=0) {
            String sowner=Lista_echipamente.get(k).getOwner();
            ArrayList<Equipment> echipamente_gasite=new ArrayList<>();
            for (int i = 0; i < Lista_echipamente.size(); i++) {
                if(Lista_echipamente.get(i).getOwner()==sowner)
                {
                    echipamente_gasite.add(Lista_echipamente.get(i));
                    Lista_echipamente.remove(i);
                    i--;
                }
            }
            OwnerGroups.put(sowner,echipamente_gasite);
        }
        return OwnerGroups;
    }

    /**
     * Remove a particular equipment from equipments list by serial number
     * @param serialNumber - unique serial number
     * @return deleted equipment instance or null if not found
     */
    public Equipment removeEquipmentBySerialNumber(final String serialNumber) {
        Equipment vinovatu;
        for(int i=0;i<Lista_echipamente.size();i++)
        {
            if(Lista_echipamente.get(i).getSerialNumber()==serialNumber)
            {
                vinovatu = Lista_echipamente.get(i);
                Lista_echipamente.remove(i);
                return vinovatu;
            }
        }
        return null;
    }
}
