package model;

public class Accessory {
    private String name;
    private String color;
    private long priceAccessory;
    private DC dc;

    public Accessory(String name, String color, long priceAccessory, DC dc) {
        this.name = name;
        this.color = color;
        this.priceAccessory = priceAccessory;
        this.dc = dc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPriceAccessory() {
        return priceAccessory;
    }

    public void setPriceAccessory(long priceAccessory) {
        this.priceAccessory = priceAccessory;
    }

    public DC getDc() {
        return dc;
    }

    public void setDc(DC dc) {
        this.dc = dc;
    }

    @Override
    public String toString() {
        return name + " - " + color + " - " + priceAccessory + " VND";
    }
    
    
}
