package StockItem;


public class Piano extends StockItem implements IPlayable {

    private String pianoType;

    public Piano(String manufacturer, String model, String colour, String type, double buyPrice, double sellPrice, boolean isForSale, String pianoType) {
        super(manufacturer, model, colour, type, buyPrice, sellPrice, isForSale);
        this.pianoType = pianoType;
    }

    public String getPianoType() {
        return pianoType;
    }

    public String makeSound(){
        return "Tinkle, tinkle!";
    }
}
