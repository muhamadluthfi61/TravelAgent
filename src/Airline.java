public class Airline {
    private int id;
    private int capacity;
    private String brand;
    private String type;

    public Airline(int id, int capacity, String brand, String type)
    {
        this.id=id;
        this.capacity=capacity;
        this.brand=brand;
        this.type=type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
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
