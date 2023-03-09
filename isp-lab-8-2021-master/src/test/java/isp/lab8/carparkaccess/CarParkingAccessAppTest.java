package isp.lab8.carparkaccess;

import isp.lab8.carparkaccess.file.FilesAndFoldersUtil;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class CarParkingAccessAppTest {

    @Test
    public void TestCarEntry() throws IOException, ClassNotFoundException {
        ParkingAccessControl pac = new ParkingAccessControl();
        pac.DeleteAll();
        Car c1 = new Car("Cj-01-AAA",System.currentTimeMillis());
        Car c2 = new Car("Cj-01-BBB",System.currentTimeMillis());
        pac.carEntry(c1);
        pac.carEntry(c2);
        List<String> files = FilesAndFoldersUtil.getFilesInFolder(pac.getWorking_folder());
        int k=0;
        for (String f:files)
        {
            k++;
        }
        assertEquals(2,k);
        k=0;
        pac.carExit("Cj-01-BBB");
        List<String> files2 = FilesAndFoldersUtil.getFilesInFolder(pac.getWorking_folder());
        for(String f:files2)
        {
            k++;
        }
        assertEquals(1,k);
        List<String> used_files = FilesAndFoldersUtil.getFilesInFolder(pac.getUsed_folder());
        k=0;
        for(String f:used_files)
        {
            k++;
        }
        assertEquals(1,k);

    }
}
