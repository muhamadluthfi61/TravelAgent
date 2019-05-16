public class TravelAgent {

    public TravelAgent()
    {

    }

    public static void main(String[] args)
    {
        Schedule schedule = new Schedule(2019,5,5,10,0,2,0);
        Location location = new Location("Jakarta","Bali");
        Airline airline = new Airline(100,50,0,"Boeing","Max 737");
        Flight flight = new Flight("JB",airline,500000,2000000,10000000,location,schedule);
        Customer customer = new Customer("fadel",1998,5,5,"fadel","fadel@gmail.com","Fadel1234");
        FlightReservation reser1 = new FlightReservation(customer, flight, SeatClasses.Economy, 50);
        System.out.println(flight.getEconomyCapacity());
        FlightReservation reser2 = new FlightReservation(customer, flight, SeatClasses.Economy, 50);
        System.out.println(flight.getEconomyCapacity());
        FlightReservation reser3 = new FlightReservation(customer, flight, SeatClasses.FirstClass, 2);
        System.out.println(flight.getFirstClassCapacity());
    }
}
