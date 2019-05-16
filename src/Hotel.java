public class Hotel {
    private int id;
    private String name;
    private HotelLocation address;
    private int stars;

    public Hotel(int id, String name, HotelLocation address, int stars) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HotelLocation getAddress() {
        return address;
    }

    public int getStars() {
        return stars;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(HotelLocation address) {
        this.address = address;
    }

    public void setStars(int stars) { this.stars = stars; }


    public String toString(){
        return "Nama Hotel\t:" + getName() + "\nLokasi\t\t" + address.getCity() + "\nBintang\t\t" + getStars();
    }
}
