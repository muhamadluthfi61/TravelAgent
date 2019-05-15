public class TravelAgent {

    public TravelAgent()
    {

    }

    public static void main(String[] args)
    {
        Schedule schedule = new Schedule(2019,5,5,10,0,2,0);
        Location location = new Location("Jakarta","Bali");
        Airline airline = new Airline(1,100,50,10,"Boeing","Max 737");
        Flight flight = new Flight("JB",airline,location,schedule);
        Customer customer = new Customer(1,"fadel",1998,5,5,"fadel","fadel@gmail.com","1234");
        Reservation reser1 = new Reservation(customer, flight, SeatClasses.Economy, 50);
        System.out.println(flight.getEconomyCapacity());
        Reservation reser2 = new Reservation(customer, flight, SeatClasses.Economy, 60);
        System.out.println(flight.getEconomyCapacity());
    }
}
