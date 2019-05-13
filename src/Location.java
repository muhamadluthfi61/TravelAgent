public class Location {
    private String from;
    private String to;
    private String address;

    public Location(String from, String to)
    {
        this.from=from;
        this.to=to;
    }

    public Location(String address) {
        this.address = address;
    }
}
