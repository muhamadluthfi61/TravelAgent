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

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
