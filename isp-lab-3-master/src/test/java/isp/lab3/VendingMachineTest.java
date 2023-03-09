package isp.lab3;
import isp.lab3.exercise5.Product;
import isp.lab3.exercise5.VendingMachine;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class VendingMachineTest {

  private List<Product> produs;

    VendingMachine VmTest =new VendingMachine(produs);

  @Test
    public void testDisplay(){
      List<Product> produse =Arrays.asList(
              new Product(1,"Twix",5),
              new Product(2,"Snickers",6),
              new Product(3,"Dorna",4)
      );
      VendingMachine VmTest = new VendingMachine(produse);
      assertEquals("Id:1 Nume:Twix Pret:5\n" +
              "Id:2 Nume:Snickers Pret:6\n" +
              "Id:3 Nume:Dorna Pret:4",VmTest.displayProducts());
  }
    @Test
    public void testInsertCoin(){
      VmTest.insertCoin(5);
      assertEquals(5, VmTest.getCredit());
    }
    @Test
    public void testSelectProduct(){
        List<Product> produse =Arrays.asList(
                new Product(1,"Twix",5),
                new Product(2,"Snickers",6),
                new Product(3,"Dorna",4)
        );
        VendingMachine VmTest = new VendingMachine(produse);
        VmTest.displayProducts();
      assertEquals("Dorna", VmTest.selectProduct(3));
    }
}
