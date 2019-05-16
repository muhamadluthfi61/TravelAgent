import java.util.ArrayList;

public class DatabaseReservation {
    private static ArrayList<FlightReservation> FLIGHT_RESERVATION_DATABASE=new ArrayList<>();
    private static int LAST_RESERVATION_ID=0;

    public static ArrayList<FlightReservation> getFlightReservationDatabase()
    {
        return FLIGHT_RESERVATION_DATABASE;
    }

    public static int getLastReservationId()
    {
        return LAST_RESERVATION_ID;
    }

    public static boolean addFlightReservation(FlightReservation flight,Customer customer)
    {
        FLIGHT_RESERVATION_DATABASE.add(LAST_RESERVATION_ID,flight);
        LAST_RESERVATION_ID++;
        return true;
    }

    public static FlightReservation getFlightReservation(int id)
    {
        for(FlightReservation flightDB : FLIGHT_RESERVATION_DATABASE)
        {
            if(flightDB.getId()==id)
            {
                return flightDB;
            }
            else throw new IllegalArgumentException("Flight Reservation doesn't exist");

        }
        return null;
    }

    public static ArrayList<FlightReservation> getFlightReservation(Customer customer)
    {
        ArrayList<FlightReservation> flight = new ArrayList<>();
        for(FlightReservation flightDB : FLIGHT_RESERVATION_DATABASE)
        {
            if(flightDB.getCustomer()==customer)
            {
                flight.add(flightDB);
            }
        }
        if(flight.size()>0)
        {
            return flight;
        }
        else
            throw new IllegalArgumentException("Flight Reservation doesn't exist");
    }

    public static boolean removeFlightReservation (int id)
    {
        for(FlightReservation flightDB : FLIGHT_RESERVATION_DATABASE)
        {
            if(flightDB.getId()==id)
            {
                FLIGHT_RESERVATION_DATABASE.remove(id);
                return true;
            }
        }
        throw new IllegalArgumentException("Flight doesn't exist");
    }
}
