package travelagent;
import java.util.ArrayList;

/**
 * This is Database Hotel
 * this class is used to store hotel data in database/arraylist
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public class DatabaseHotel {
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<>();
    private static int LAST_HOTEL_ID = 0;

    /**
     * This method is used to get all the content of database/arraylist
     * @return HOTEL_DATABASE
     */
    public static ArrayList<Hotel> getHotelDatabase(){
        return HOTEL_DATABASE;
    }

    /**
     * This method is used to get the last hotel id that has been inserted before.
     * @return LAST_HOTEL_ID
     */
    public static int getLastHotelId() {
        return LAST_HOTEL_ID;
    }

    /**
     * This method is used to add/insert hotel data into database/arraylist
     * @param hotel hotel data
     * @return true or throw exception
     * @exception IllegalArgumentException error when hotel already exist
     */
    public static boolean addHotel(Hotel hotel){
        for (Hotel temp : HOTEL_DATABASE){
            if (temp.getName().equals(hotel.getName())){
                throw new IllegalArgumentException("Hotel Already Exist");
            }
        }
        HOTEL_DATABASE.add(hotel);
        LAST_HOTEL_ID = hotel.getId();
        return true;
    }

    /**
     * This method is used to get hotel data based on their id
     * @param id hotel's id
     * @return hotel's data or throw excepition
     * @exception IllegalArgumentException error when hotel doesn't exist
     */
    public static Hotel getHotel(int id){
        for (Hotel hotel : HOTEL_DATABASE){
            if (hotel.getId()==id){
                return hotel;
            }
            else{
                throw new IllegalArgumentException("Hotel doesn't Exist");
            }
        }
        return null;
    }

    /**
     * This method is used to remove hotel based on their id
     * @param id hotel's id
     * @return true or throws exception
     * @exception IllegalArgumentException error when hotel doesn't exist
     */
    public static boolean removeHotel(int id){
        for (Hotel hotel : HOTEL_DATABASE){
            if (hotel.getId() == id){
                int index = HOTEL_DATABASE.indexOf(hotel);
                HOTEL_DATABASE.remove(hotel);
                return true;
            }
        }
        throw new IllegalArgumentException("Hotel doesn't Exist");
    }
}
