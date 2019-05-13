public class Hotel {
private int id;
private String name;
private Location address;
private HotelStars HOTEL_STAR;

    public Hotel(int id, String name, Location address, int star) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.HOTEL_STAR = HotelStars.fromInt(star);
    }
}
