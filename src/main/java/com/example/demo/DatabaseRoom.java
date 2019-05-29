package travelagent;
import java.util.ArrayList;

/**
 * This is Database Room Class
 * this class is used to store room into database/arraylist
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public class DatabaseRoom {
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<>();

    /**
     * This method is used to get all room within database/arraylist
     * @return ROOM_DATABASE
     */
    public static ArrayList<Room> getRoomDatabase(){
        return  ROOM_DATABASE;
    }

    /**
     * This method is used to add/insert new room into database/arraylist
     * @param room room
     * @return true or throw exception
     * @exception  IllegalArgumentException error when room already exist
     */
    public static boolean addRoom(Room room){
        for (Room temp : ROOM_DATABASE){
            if (temp.getHotel()==room.getHotel()&&temp.getRoom_number()==room.getRoom_number()){
                throw new IllegalArgumentException("Room Already Exist");
            }
        }
        ROOM_DATABASE.add(room);
        return true;
    }

    /**
     * This method is used to get room data based on hotel
     * @param hotel hotel
     * @return an arraylist of room or null
     */
    public static ArrayList<Room> getRoomFromHotel(int hotel){
        ArrayList<Room> value = null;
        for(Room temp : ROOM_DATABASE){
            if (temp.getHotel().getId()==hotel){
                value.add(temp);
            }
        }
        return value;
    }

    /**
     * This method is used to get room data based on room's type
     * @param type room type
     * @return an arraylist of room or null
     */
    public static ArrayList<Room> getRoomFromType(String type){
        ArrayList<Room> value = null;
        for (Room temp : ROOM_DATABASE){
            if(temp.getRoomType().toString()==type){
                value.add(temp);
            }
        }
        return value;
    }

    /**
     * This method is used to get room data that is vacant
     * @return an arraylist of room or null
     */
    public static ArrayList<Room> getRoomThatVacant(){
        ArrayList<Room> value = null;
        for (Room temp : ROOM_DATABASE){
            if(temp.getIsVacant()==true){
                value.add(temp);
            }
        }
        return value;
    }

    /**
     * This method is used to remove room from database/arraylist based on room number and hotel
     * @param number room's number
     * @param hotel room's hotel
     * @return true or throws exception
     * @exception  IllegalArgumentException error when room doesn't exist
     */
    public static boolean removeRoom(int number,int hotel){
        for (Room temp:ROOM_DATABASE){
            if (temp.getRoom_number()==number && temp.getHotel().getId()==hotel){
                int index = ROOM_DATABASE.indexOf(temp);
                ROOM_DATABASE.remove(index);
                return true;
            }
        }
        throw new IllegalArgumentException("Room doesn't Exist");
    }
}
