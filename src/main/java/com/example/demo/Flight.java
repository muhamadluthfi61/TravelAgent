package travelagent;

/**
 * This is Flight class
 * this class is used to create flight data object
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public class Flight {
    private int id;
    private String airline;
    private int capacity;
    private int economyCapacity;
    private int businessCapacity;
    private int firstClassCapacity;
    private int economyPrice;
    private int businessPrice;
    private int firstClassPrice;
    private Location route;
    private Schedule schedule;

    /**
     * This is constructor of flight class
     * @param airline name of the airline
     * @param economyCapacity capacity of economy class
     * @param businessCapacity capacity of business class
     * @param firstClassCapacity capacity of first class
     * @param economyPrice price of economy class
     * @param businessPrice price of business class
     * @param firstClassPrice price of first class
     * @param route route of flight
     * @param schedule schedule of flight
     */
    public Flight(String airline, int economyCapacity, int businessCapacity, int firstClassCapacity, int economyPrice, int businessPrice, int firstClassPrice, Location route, Schedule schedule) {
        this.id=DatabaseFlight.getLastFlight()+1;
        this.airline = airline;
        this.economyCapacity = economyCapacity;
        this.businessCapacity = businessCapacity;
        this.firstClassCapacity = firstClassCapacity;
        this.capacity = economyCapacity+businessCapacity+firstClassCapacity;
        this.economyPrice = economyPrice;
        this.businessPrice = businessPrice;
        this.firstClassPrice = firstClassPrice;
        this.route = route;
        this.schedule = schedule;
    }


    /**
     * This method is used to get the id of flight
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * This method is used to get the name of the airline
     * @return airline
     */
    public String getAirline() {
        return airline;
    }

    /**
     * This method is used to set/update the airline
     * @param airline airline
     */
    public void setAirline(String airline) {
        this.airline = airline;
    }

    /**
     * This method is used to get te capacity of the flight
     * @return total capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * This method is used to set/update the total capacity of the flight
     */
    public void setCapacity() {
        this.capacity = economyCapacity+businessCapacity+firstClassCapacity;
    }

    /**
     * This method is used to get te economic class capacity of the flight
     * @return economic capacity
     */
    public int getEconomyCapacity() {
        return economyCapacity;
    }

    /**
     * This method is used to set/update the capacity of economic class
     * @param economyCapacity capacity of economic class
     * @throws NoCapacityException error when capacity is not enough
     */
    public void setEconomyCapacity(int economyCapacity) throws NoCapacityException {
        if(economyCapacity<0)
        {
            throw new NoCapacityException();
        }
        this.economyCapacity = economyCapacity;
    }


    /**
     * This method is used to get the capacity of business class
     * @return capacity of business class
     */
    public int getBusinessCapacity() {
        return businessCapacity;
    }

    /**
     * This methis is used to set/update the capacity of business class
     * @param businessCapacity capaicty of business class
     * @throws NoCapacityException error when capacity is not enough
     */
    public void setBusinessCapacity(int businessCapacity) throws NoCapacityException {
        if(businessCapacity<0)
        {
            throw new NoCapacityException();
        }this.businessCapacity = businessCapacity;
    }

    /**
     * This method is used to get the capacity of First class
     * @return capacity of first class
     */
    public int getFirstClassCapacity() {
        return firstClassCapacity;
    }

    /**
     * This method is used to set/update the capacity of first class
     * @param firstClassCapacity capacity of first class
     * @throws NoCapacityException error when capacity is not enough
     */
    public void setFirstClassCapacity(int firstClassCapacity) throws NoCapacityException {
        if(firstClassCapacity<0)
        {
            throw new NoCapacityException();
        }this.firstClassCapacity = firstClassCapacity;
    }

    /**
     * This method is used to get the price of economy class
     * @return price of economy class
     */
    public int getEconomyPrice() {
        return economyPrice;
    }

    /**
     * This method is used to set/update the price of economy class
     * @param economyPrice price of economy class
     */
    public void setEconomyPrice(int economyPrice) {
        this.economyPrice = economyPrice;
    }


    /**
     * This method is used to get the price of business class
     * @return price of business class
     */
    public int getBusinessPrice() {
        return businessPrice;
    }

    /**
     * This method is used to set/update the price of business class
     * @param businessPrice price of business class
     */
    public void setBusinessPrice(int businessPrice) {
        this.businessPrice = businessPrice;
    }


    /**
     * This method is used to get the price of first class
     * @return price of first class
     */
    public int getFirstClassPrice() {
        return firstClassPrice;
    }

    /**
     * This method is used to set/update the price of first class
     * @param firstClassPrice price of first class
     */
    public void setFirstClassPrice(int firstClassPrice) {
        this.firstClassPrice = firstClassPrice;
    }

    /**
     * This method is used to get the route of the flight
     * @return route
     */
    public Location getRoute() {
        return route;
    }

    /**
     * This method is used to set/update route of the flight
     * @param route route
     */
    public void setRoute(Location route) {
        this.route = route;
    }

    /**
     * This method is used to get the schedule of the flight
     * @return schedule
     */
    public Schedule getSchedule() {
        return schedule;
    }

    /**
     * This method is used to set/update the schedule of the flight
     * @param schedule schedule
     */
    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
