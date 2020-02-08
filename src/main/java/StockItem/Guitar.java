package StockItem;

public class Guitar extends StockItem implements IPlayable{

    private String guitarType;
    private int numberOfStrings;

    public Guitar(String manufacturer, String model, String colour, String type, double buyPrice, double sellPrice, String guitarType, int numberOfStrings, boolean isForSale
            ) {
        super(manufacturer, model, colour, type, buyPrice, sellPrice, isForSale);
        this.guitarType = guitarType;
        this.numberOfStrings = numberOfStrings;
    }

    public String getGuitarType() {
        return guitarType;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public String makeSound(){
        return "Tinkle, tinkle!";
    }
}
