public class Flight {
    private String number;
    private Airline airline;
    private int capacity;
    private int economyCapacity;
    private int businessCapacity;
    private int firstClassCapacity;
    private int economyPrice;
    private int businessPrice;
    private int firstClassPrice;
    private Location route;
    private Schedule schedule;

    public Flight(String number, Airline airline, int economyPrice, int businessPrice, int firstClassPrice, Location route, Schedule schedule) {
        this.number = number;
        this.airline = airline;
        this.capacity = airline.getCapacity();
        this.economyCapacity = airline.getEconomyCapacity();
        this.businessCapacity = airline.getBusinessCapacity();
        this.firstClassCapacity = airline.getFirstClassCapacity();
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
        this.firstClassPrice = firstClassPrice;
        this.route = route;
        this.schedule = schedule;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Airline getAirline() {
        return airline;
    }

    public void setAirline(Airline airline) {
        this.airline = airline;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity() {
        this.capacity = economyCapacity+businessCapacity+firstClassCapacity;
    }

    public int getEconomyCapacity() {
        return economyCapacity;
    }

    public void setEconomyCapacity(int economyCapacity) throws NoCapacityException {
        if(economyCapacity<0)
        {
            throw new NoCapacityException();
        }
        this.economyCapacity = economyCapacity;
    }

    public int getBusinessCapacity() {
        return businessCapacity;
    }

    public void setBusinessCapacity(int businessCapacity) throws NoCapacityException {
        if(businessCapacity<0)
        {
            throw new NoCapacityException();
        }this.businessCapacity = businessCapacity;
    }

    public int getFirstClassCapacity() {
        return firstClassCapacity;
    }

    public void setFirstClassCapacity(int firstClassCapacity) throws NoCapacityException {
        if(firstClassCapacity<0)
        {
            throw new NoCapacityException();
        }this.firstClassCapacity = firstClassCapacity;
    }

    public int getEconomyPrice() {
        return economyPrice;
    }

    public void setEconomyPrice(int economyPrice) {
        this.economyPrice = economyPrice;
    }

    public int getBusinessPrice() {
        return businessPrice;
    }

    public void setBusinessPrice(int businessPrice) {
        this.businessPrice = businessPrice;
    }

    public int getFirstClassPrice() {
        return firstClassPrice;
    }

    public void setFirstClassPrice(int firstClassPrice) {
        this.firstClassPrice = firstClassPrice;
    }

    public Location getRoute() {
        return route;
    }

    public void setRoute(Location route) {
        this.route = route;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
