package travelagent;

/**
 * This is Flight Reservation Class
 * this class is used to create reservation for flight
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public class FlightReservation {
    private int id;
    private Customer customer;
    private Flight flight;
    private SeatClasses SEAT_CLASS;
    private int numberOfPeople;
    private int totalPrice;
    private boolean isActive;

    /**
     * This is the constructor of Flight Reservation class
     * @param customer customer
     * @param flight customer
     * @param SEAT_CLASS seat's class
     * @param numberOfPeople number of people
     */
    public FlightReservation(Customer customer, Flight flight, SeatClasses SEAT_CLASS, int numberOfPeople)
    {
        this.id=DatabaseReservation.getLastReservationId()+1;
        this.customer=customer;
        this.flight=flight;
        this.SEAT_CLASS=SEAT_CLASS;
        this.numberOfPeople=numberOfPeople;
        this.isActive=true;
        if(this.SEAT_CLASS==SeatClasses.Economy)
        {
            try {
                this.totalPrice=flight.getEconomyPrice()*numberOfPeople;
                numberOfPeople=flight.getEconomyCapacity()-numberOfPeople;
                flight.setEconomyCapacity(numberOfPeople);

            }catch (NoCapacityException e)
            {
                throw new IllegalArgumentException(e.getExMessage());
            }
        }

        if(this.SEAT_CLASS==SeatClasses.Business)
        {
            try {
                this.totalPrice=flight.getBusinessPrice()*numberOfPeople;
                numberOfPeople=flight.getBusinessCapacity()-numberOfPeople;
                flight.setBusinessCapacity(numberOfPeople);

            }catch (NoCapacityException e)
            {
                throw new IllegalArgumentException(e.getExMessage());
            }
        }
        if(this.SEAT_CLASS==SeatClasses.FirstClass)
        {
            try {
                this.totalPrice=flight.getFirstClassPrice()*numberOfPeople;
                numberOfPeople=flight.getFirstClassCapacity()-numberOfPeople;
                flight.setFirstClassCapacity(numberOfPeople);

            }catch (NoCapacityException e)
            {
                throw new IllegalArgumentException(e.getExMessage());
            }
        }
    }

    /**
     * This method is used to get the id of flight reservation
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * This method is used to set/update the id of the flight reservation
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * This method is used to get the customer
     * @return customer
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * This method is used to set/update customer
     * @param customer customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * This method os used to get flight data
     * @return flight data
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * This method is used to set/update the flight data
     * @param flight flight data
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    /**
     * This method is used to get the seat's class
     * @return SEAT_CLASS
     */
    public SeatClasses getSEAT_CLASS() {
        return SEAT_CLASS;
    }

    /**
     * This method is used to set/update seat's class
     * @param SEAT_CLASS SEAT_CLASS
     */
    public void setSEAT_CLASS(SeatClasses SEAT_CLASS) {
        this.SEAT_CLASS = SEAT_CLASS;
    }

    /**
     * This method is used to get number of people
     * @return number of people
     */
    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    /**
     * This method is used to set/update the number of people
     * @param numberOfPeople number of people
     */
    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    /**
     * This method is used to get the total price of the reservation
     * @return total price
     */
    public int getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method is used to set/update the total price of the reservation
     * @param totalPrice total price
     */
    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    /**
     * This method is to know the reservation is active or not
     * @return true or false
     */
    public boolean isActive() {
        return isActive;
    }

    /**
     * This method is used to set/update the status of reservation
     * @param active boolean
     */
    public void setActive(boolean active) {
        isActive = active;
    }
}
