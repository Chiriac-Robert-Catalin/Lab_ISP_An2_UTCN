/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise1;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.swing.table.AbstractTableModel;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

/**
 *
 * @author RCC
 */
public class PortofolioQueryService  extends AbstractTableModel{
     private String[] columns = new String[] {"Name","Symbol", "Price", "Currency", "Change","Quantity", "Exchange"};
     private String[] symbols = new String[] {"INTC", "BABA", "TSLA", "AIR.PA", "MSFT", "AAPL"};     
     private Map<String, Stock> stocks = new HashMap<String, Stock>();
     private ArrayList<OwnedStockItem> owned_items = new ArrayList<>();
     private StockMarketQueryService marketService;
     public Portofolio portofolio;
    
     
     public void requestData() throws IOException{
         this.portofolio = new Portofolio(BigDecimal.valueOf(1000),marketService);
         stocks = YahooFinance.get(symbols);
         owned_items = new ArrayList<>();
         stocks.values().stream().forEach(s -> owned_items.add(new OwnedStockItem(s)));
         //stocks.values().stream().forEach(s-> this.portofolio.getOwnedStocks().add(new OwnedStockItem(s)));
         for(OwnedStockItem f:owned_items)
         {
             System.out.println("------");
             System.out.println(f.getStock().getSymbol()+" "+f.getQuantity());
             /*for(OwnedStockItem g:this.portofolio.getOwnedStocks())
             {
                 System.out.println(f.getStock().getSymbol()+" "+g.getStock().getSymbol()+" "+g.getQuantity());
                 if(f.getStock().getSymbol().equals(g.getStock().getSymbol()))
                     f.setQuantity(g.getQuantity());
             }*/
         }
         System.out.println(this.portofolio.getOwnedStocks().isEmpty());
         for(OwnedStockItem f:this.portofolio.getOwnedStocks())
         {
             System.out.println(f.getStock().getSymbol());
         }
         this.fireTableDataChanged();
     }
     
     
     /**
      * Used to populate drop down button (Combo Box).
      * @return 
      */
     public String[] getSymbols(){
         return symbols;
     }
     
    //--------------------------------------------------------------
    @Override
    public int getRowCount() {
        return stocks.size();
    }
    

    
    
    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        OwnedStockItem i = owned_items.get(rowIndex);
        
        switch(columnIndex){
            case 0:return i.getStock().getName();
            case 1:return i.getStock().getSymbol();
            case 2: if(i.getStock().getPrice()!=null) return i.getStock().getPrice().toPlainString(); else return "N/A";
            case 3:return i.getStock().getCurrency();
            case 4:return i.getStock().getChange().toPlainString()+"%";
            case 5:return i.getQuantity();
            case 6:return i.getStock().getExchange();
        }
        return "N/A";
    }
    
    @Override
    public String getColumnName(int index) {
        return columns[index];
    }
     
}
