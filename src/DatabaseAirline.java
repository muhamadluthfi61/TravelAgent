import java.util.ArrayList;

public class DatabaseAirline {
    private static ArrayList<Airline> AIRLINE_DATABASE=new ArrayList<>();
    private static int LAST_AIRLINE_ID=0;

    public static ArrayList<Airline> getAirlineDatabase()
    {
        return AIRLINE_DATABASE;
    }

    public static int getLastAirline()
    {
        return LAST_AIRLINE_ID;
    }

    public static boolean addAirline(Airline airline)
    {
        for(Airline airlineDB : AIRLINE_DATABASE)
        {
            if(airline.getType()==airlineDB.getType())
            {
                throw new IllegalArgumentException("Airline already exist");
            }
        }
        AIRLINE_DATABASE.add(airline);
        LAST_AIRLINE_ID=airline.getId();
        return true;
    }

    public static Airline getAirline(int id)
    {
        for(Airline airlineDB : AIRLINE_DATABASE)
        {
            if(airlineDB.getId()==id)
            {
                return airlineDB;
            }
            else
                throw new IllegalArgumentException("Airline doesn't exist");
        }
        return null;
    }

    public static boolean removeAirline (int id)
    {
        for(Airline AirlineDB : AIRLINE_DATABASE)
        {
            if(AirlineDB.getId()==id)
            {
                AIRLINE_DATABASE.remove(id);
                return true;
            }
        }
        throw new IllegalArgumentException("Airline doesn't exist");
    }

}
