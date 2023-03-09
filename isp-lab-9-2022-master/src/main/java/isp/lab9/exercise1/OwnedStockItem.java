/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise1;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
import lombok.Getter;
import lombok.Setter;
import yahoofinance.Stock;

/**
 *
 * @author RCC
 */
public class OwnedStockItem {
    @Getter @Setter
    private StockItem stock;
    @Getter @Setter
    private int quantity;
    
    public OwnedStockItem(StockItem StockI)
    {
        this.stock=StockI;
        this.quantity=0;
    }
    public OwnedStockItem(Stock stock){
        StockItem SI= new StockItem(stock);
        this.stock=SI;
        quantity=0;
    }
    
}
