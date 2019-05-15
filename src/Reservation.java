public class Reservation {
    private Customer customer;
    private Flight flight;
    private SeatClasses SEAT_CLASS;
    private int numberOfPeople;

    public Reservation(Customer customer, Flight flight, SeatClasses SEAT_CLASS, int numberOfPeople)
    {
        this.customer=customer;
        this.flight=flight;
        this.SEAT_CLASS=SEAT_CLASS;
        this.numberOfPeople=numberOfPeople;
        if(this.SEAT_CLASS==SeatClasses.Economy)
        {
            try {
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
                numberOfPeople=flight.getFirstClassCapacity()-numberOfPeople;
                flight.setFirstClassCapacity(numberOfPeople);
            }catch (NoCapacityException e)
            {
                throw new IllegalArgumentException(e.getExMessage());
            }
        }
    }


}
