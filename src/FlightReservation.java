public class FlightReservation {
    private int id;
    private Customer customer;
    private Flight flight;
    private SeatClasses SEAT_CLASS;
    private int numberOfPeople;
    private int totalPrice;

    public FlightReservation(Customer customer, Flight flight, SeatClasses SEAT_CLASS, int numberOfPeople)
    {
        this.id=DatabaseReservation.getLastReservationId();
        this.customer=customer;
        this.flight=flight;
        this.SEAT_CLASS=SEAT_CLASS;
        this.numberOfPeople=numberOfPeople;
        if(this.SEAT_CLASS==SeatClasses.Economy)
        {
            try {
                numberOfPeople=flight.getEconomyCapacity()-numberOfPeople;
                flight.setEconomyCapacity(numberOfPeople);
                this.totalPrice=flight.getEconomyPrice()*numberOfPeople;
            }catch (NoCapacityException e)
            {
                throw new IllegalArgumentException(e.getExMessage());
            }
        }

        if(this.SEAT_CLASS==SeatClasses.Business)
        {
            try {
                numberOfPeople=flight.getBusinessCapacity()-numberOfPeople;
                flight.setBusinessCapacity(numberOfPeople);
                this.totalPrice=flight.getBusinessPrice()*numberOfPeople;
            }catch (NoCapacityException e)
            {
                throw new IllegalArgumentException(e.getExMessage());
            }
        }
        if(this.SEAT_CLASS==SeatClasses.FirstClass)
        {
            try {
                numberOfPeople=flight.getFirstClassCapacity()-numberOfPeople;
                flight.setFirstClassCapacity(numberOfPeople);
                this.totalPrice=flight.getFirstClassPrice()*numberOfPeople;
            }catch (NoCapacityException e)
            {
                throw new IllegalArgumentException(e.getExMessage());
            }
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public SeatClasses getSEAT_CLASS() {
        return SEAT_CLASS;
    }

    public void setSEAT_CLASS(SeatClasses SEAT_CLASS) {
        this.SEAT_CLASS = SEAT_CLASS;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }
}
