public class Airline {
    private int id;
    private int capacity;
    private int economyCapacity;
    private int businessCapacity;
    private int firstClassCapacity;
    private String brand;
    private String type;

    public Airline(int economyCapacity, int businessCapacity, int firstClassCapacity, String brand, String type)
    {
        this.id=DatabaseAirline.getLastAirline()+1;
        this.economyCapacity=economyCapacity;
        this.businessCapacity=businessCapacity;
        this.firstClassCapacity=firstClassCapacity;
        this.capacity=economyCapacity+businessCapacity+firstClassCapacity;
        this.brand=brand;
        this.type=type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEconomyCapacity() {
        return economyCapacity;
    }

    public void setEconomyCapacity(int economyCapacity) {
        this.economyCapacity = economyCapacity;
    }

    public int getBusinessCapacity() {
        return businessCapacity;
    }

    public void setBusinessCapacity(int businessCapacity) {
        this.businessCapacity = businessCapacity;
    }

    public int getFirstClassCapacity() {
        return firstClassCapacity;
    }

    public void setFirstClassCapacity(int firstClassCapacity) {
        this.firstClassCapacity = firstClassCapacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity() {
        this.capacity = economyCapacity+businessCapacity+firstClassCapacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
