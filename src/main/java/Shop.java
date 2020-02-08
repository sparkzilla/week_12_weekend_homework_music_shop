import StockItem.ISellable;
import StockItem.StockItem;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISellable> stock;

    public Shop() {
        this.stock = new ArrayList<>();
    }

    public ArrayList<ISellable> getStock() {
        return stock;
    }

    public void addItemToStock(ISellable item){
        if (item.isForSale()) {
            this.stock.add(item);
        }
    }

    public void removeItemFromStock(ISellable item){
        this.stock.remove(item);
    }

    public double calculateTotalMarkup(){
        double totalMarkUp = 0;
        for (ISellable item : this.stock){
            totalMarkUp += item.calculateMarkup();
        }
     return totalMarkUp;
    }
}
