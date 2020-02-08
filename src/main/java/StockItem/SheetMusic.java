package StockItem;

public class SheetMusic extends StockItem {

    private String songName;

    public SheetMusic(String manufacturer, String model, String colour, String type, double buyPrice, double sellPrice, String songName, boolean isForSale) {
        super(manufacturer, model, colour, type, buyPrice, sellPrice, isForSale );
        this.songName = songName;

    }
}
