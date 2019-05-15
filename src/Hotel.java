public class Hotel {
    private int id;
    private String name;
    private Location address;
    private int stars;

    public Hotel(int id, String name, Location address, int stars) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.stars = stars;
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

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
