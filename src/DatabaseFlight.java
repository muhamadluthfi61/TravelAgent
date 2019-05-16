import java.util.ArrayList;

public class DatabaseFlight {
    private static ArrayList<Flight> FLIGHT_DATABASE=new ArrayList<>();

    public static ArrayList<Flight> getFlightDatabase()
    {
        return FLIGHT_DATABASE;
    }

    public static boolean addFlight(Flight flight)
    {
        for(Flight flightDB : FLIGHT_DATABASE)
        {
            if(flight.getNumber()==flightDB.getNumber())
            {
                throw new IllegalArgumentException("Flight already exist");
            }
        }
        FLIGHT_DATABASE.add(flight);
        return true;
    }

    public static Flight getFlight(String number)
    {
        for(Flight flightDB : FLIGHT_DATABASE)
        {
            if(flightDB.getNumber()==number)
            {
                return flightDB;
            }
            else throw new IllegalArgumentException("Flight doesn't exist");

        }
        return null;
    }

    public static boolean removeFlight (String number)
    {
        for(Flight flightDB : FLIGHT_DATABASE)
        {
            if(flightDB.getNumber()==number)
            {
                FLIGHT_DATABASE.remove(number);
                return true;
            }
        }
        throw new IllegalArgumentException("Flight doesn't exist");
    }
}
