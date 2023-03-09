/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package isp.lab9.exercise1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author mihai.hulea
 */
public class Portofolio {

    @Getter
    @Setter
    private BigDecimal funds;
    private StockMarketQueryService marketService;
    @Getter
    @Setter
    private ArrayList<OwnedStockItem> OwnedStocks;

    public Portofolio(BigDecimal funds, StockMarketQueryService marketService) {
        this.funds = funds;
        this.OwnedStocks = new ArrayList<>();
        this.marketService = marketService;
    }

    public void Buy(String symbol, int q) {
        System.out.println("BUY" + q + " " + symbol);
        BigDecimal price = marketService.getPriceBySymbol(symbol);
        BigDecimal cost = price.multiply(BigDecimal.valueOf(q));
        System.out.println(cost.doubleValue());
        System.out.println(funds.doubleValue());
        System.out.println(cost.compareTo(funds));
        if (cost.compareTo(funds) <= 0) {

            int ok = 0;
            for (OwnedStockItem f : OwnedStocks) {
                System.out.println(f.getStock().getSymbol()+" "+symbol);
                System.out.println(f.getStock().getSymbol().equals(symbol));
                boolean ok1=f.getStock().getSymbol().equals(symbol);
                System.out.println(ok);
                System.out.println(ok1);
                if (ok1==true) {
                    ok = 1;
                    System.out.println("Intrat");
                    f.setQuantity(f.getQuantity() + q);
                }
                System.out.println(ok);
            }
            if (ok == 0) {
                OwnedStockItem s = new OwnedStockItem(marketService.getStockBySymbol(symbol));
                s.setQuantity(q);
                this.OwnedStocks.add(s);
            }
            this.setFunds(funds.subtract(cost));
            System.out.println(funds);
        }
        else
        {
            System.out.println("NotEnoughMoney");
        }
        for(OwnedStockItem f: OwnedStocks)
        {
            System.out.println(f.getStock().getSymbol()+" "+f.getQuantity());
        }
    }
    public void Sell(String symbol,int quantity)
    {
        System.out.println("Sell "+ quantity + " stock " + symbol);
        for(OwnedStockItem f :this.OwnedStocks)
        {
            if(f.getStock().getSymbol().equals(symbol)==true)
            {
                if(f.getQuantity()>=quantity)
                {
                    this.setFunds(funds.add(f.getStock().getPrice().multiply(BigDecimal.valueOf(quantity))));
                    f.setQuantity(f.getQuantity()-quantity);
                    
                }
                else
                    System.out.println("Not enough stocks");
            }
        }
    }
}
