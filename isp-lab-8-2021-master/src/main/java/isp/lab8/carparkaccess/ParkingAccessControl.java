/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isp.lab8.carparkaccess;

import isp.lab8.carparkaccess.file.FilesAndFoldersUtil;
import isp.lab8.carparkaccess.file.ParkingAccessFileControl;
import isp.lab8.carparkaccess.file.SerializableUtil;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Random.*;

/**
 *
 * @author mihai.hulea
 */
public class ParkingAccessControl {

    public static final int MAX_CAPACITY = 5;
    private String used_folder = "E:\\Facultate\\An2\\GITHUB\\isp-labs-2022-Chiriac-Robert-Catalin-30125\\isp-lab-8-2021-master\\used_car_data";
    private  String working_folder="E:\\Facultate\\An2\\GITHUB\\isp-labs-2022-Chiriac-Robert-Catalin-30125\\isp-lab-8-2021-master\\car_data";
    private  int UNIT_PRICE = 1;

    public String getUsed_folder() {
        return used_folder;
    }

    public String getWorking_folder() {
        return working_folder;
    }

    public ParkingAccessControl() {
    }

    public void DeleteAll()
    {
        List<String> files = FilesAndFoldersUtil.getFilesInFolder(working_folder);
        List<String> used_files = FilesAndFoldersUtil.getFilesInFolder(used_folder);
        for(String f:files)
        {
            FilesAndFoldersUtil.deleteFile(working_folder + "\\"+f);
        }
        for(String f :used_files)
        {
            FilesAndFoldersUtil.deleteFile(used_folder+"\\"+f);
        }
    }
    public void carEntry(Car car) {
        //1. sa verific capacitatea 
        //2. daca capacitatea este depasita -> return 
        //3. verific daca nu cumva masina este deja in parcare, si daca este -> return 
        //4. daca masina nu este in parcare salvez obiectul de tip car in parkedCars 
        try {
            SerializableUtil.writeVehicle(car, working_folder+"\\"+"car_"+car.getPlateNumber()+".dat");
        } catch (IOException ex) {
            Logger.getLogger(ParkingAccessFileControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int carExit(String plateNumber) throws IOException, ClassNotFoundException {
        //1. cautam dupa plate number un Car in parkedCars
        //2. daca nu am gasit plateNumber -> return 
        //3. daca am gasit masina, 
        //calculez timpul de asteptare in parcare, -> System.currentTimeMiliseconds()
        //calculez pretul,
        //sterg masina din parkedCars si o adaug in previousCars
        //returnez pretul
        //get all files in working folder
        try {
            List<String> files = FilesAndFoldersUtil.getFilesInFolder(working_folder);

            for (String f : files) {
                //get vehicle and look for plate number
                System.out.println("Search " + f);
                Car v = (Car) SerializableUtil.readVehicle(working_folder + "\\" + f);
                if (v.getPlateNumber().equals(plateNumber)) {
                    //if plate number found calculate price, remove vehicle and return price
                    System.out.println("Vehicle is exiting car park.");
                    long stay = (System.currentTimeMillis() - v.getEntryTime()) / 1000;
                    double Sec1 = Math.random();
                    double Sec2 = Math.random();
                    double Sec3 = Math.random();
                    DetailsCar dcar = new DetailsCar(v,stay*UNIT_PRICE);
                    SerializableUtil.writeVehicle(dcar,used_folder+"\\used_car_"+plateNumber+"_"+(Sec2 * Sec1 /Sec3)+".dat");
                    FilesAndFoldersUtil.deleteFile(working_folder + "\\car_" + plateNumber + ".dat");
                    return (int) (stay * UNIT_PRICE);
                }
            }

        }catch(Exception e){
        e.printStackTrace();
    }
        return -1;
    }
    
    public void viewCurrentCars() throws IOException, ClassNotFoundException {
       List<String> files = FilesAndFoldersUtil.getFilesInFolder(working_folder);
       for(String f:files)
       {
           Car car = (Car) SerializableUtil.readVehicle(working_folder+"\\"+f);
           System.out.println(car.getPlateNumber());
       }
    }
    
    public void viewPastEntriesForCar(String plateNumber) throws IOException, ClassNotFoundException {
        List<String> files = FilesAndFoldersUtil.getFilesInFolder(used_folder);
        for(String f:files)
        {
            DetailsCar dcar = (DetailsCar) SerializableUtil.readVehicle(used_folder+"\\"+f);
            if(dcar.getCar().getPlateNumber().equals(plateNumber))
                System.out.println(dcar.getCar().getPlateNumber()+" "+dcar.getCost());
        }
    }
    
    public void viewPastUniqueEntries() throws IOException, ClassNotFoundException {
        HashMap<String,Integer> History = new HashMap<>();
        List<String> files = FilesAndFoldersUtil.getFilesInFolder(used_folder);
        for(String f:files) {
            DetailsCar v = (DetailsCar) SerializableUtil.readVehicle(used_folder+"\\"+f);
            Integer count = History.get(v.getCar().getPlateNumber());
            if(count==null)
            {
                count = 1;
            }
            else
            {
                count +=1;
            }
            History.put(v.getCar().getPlateNumber(),count);
        }
        for(String i:History.keySet())
        {
            System.out.println("cars:"+i+" times entered" + History.get(i));
        }
    }
    
}
