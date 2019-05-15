public class Flight {
    private String number;
    private Airline airline;
    private int capacity;
    private int economyCapacity;
    private int businessCapacity;
    private int firstClassCapacity;
    private Location route;
    private Schedule schedule;

    public Flight(String number, Airline airline, Location route, Schedule schedule) {
        this.number = number;
        this.airline = airline;
        this.capacity = airline.getCapacity();
        this.economyCapacity = airline.getEconomyCapacity();
        this.businessCapacity = airline.getBusinessCapacity();
        this.firstClassCapacity = airline.getFirstClassCapacity();
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
        if(economyCapacity<=0)
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
