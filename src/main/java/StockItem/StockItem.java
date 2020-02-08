package StockItem;

public abstract class StockItem implements ISellable{

    private String manufacturer;
    private String model;
    private String colour;
    private String type;
    private double buyPrice;
    private double sellPrice;
    private boolean forSale;

    public StockItem(String manufacturer, String model, String colour, String type, double buyPrice, double sellPrice, boolean forSale) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.colour = colour;
        this.type = type;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.forSale = forSale;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice(){
        return sellPrice;
    }

    public boolean isForSale(){
        return this.forSale;
    }

    public double calculateMarkup(){
        return sellPrice - buyPrice;
    }
}
