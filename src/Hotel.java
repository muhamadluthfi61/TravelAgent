public class Hotel {
private int id;
private String name;
private Location address;
private HotelStars HOTEL_STAR;

    public Hotel(int id, String name, Location address, HotelStars HOTEL_STAR) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.HOTEL_STAR = HOTEL_STAR;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getAddress() {
        return address;
    }

    public void setAddress(Location address) {
        this.address = address;
    }

    public HotelStars getHOTEL_STAR() {
        return HOTEL_STAR;
    }

    public void setHOTEL_STAR(HotelStars HOTEL_STAR) {
        this.HOTEL_STAR = HOTEL_STAR;
    }
}
