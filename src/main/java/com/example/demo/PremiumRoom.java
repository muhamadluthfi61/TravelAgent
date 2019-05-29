package travelagent;

/**
 * This is PremiumRoom Class that is a sub class of Room Class
 * this class is used to create Room Object with roomtype = Premium
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public class PremiumRoom extends Room{
    private static final RoomType ROOM_TYPE = RoomType.Premium;

    /**
     * This is the constructor of PremiumRoom Class
     * @param hotel hotel
     * @param room_number room number
     * @param dailyPrice daily price
     */
    public PremiumRoom(Hotel hotel, int room_number,int dailyPrice) {
        super(hotel, room_number,dailyPrice);
    }

    /**
     * This method is used to get the type of room
     * @return type of room
     */
    public RoomType getRoomType(){
        return ROOM_TYPE;
    }

    /**
     * This method is used to display the Room;'s detail
     * @return String
     */
    public String toString(){
        return "Room Number:\t"
                + super.getRoom_number()
                + "\nHotel:\t"
                + super.getHotel().getName()
                + "\nDaily Price:\t"
                + super.getDailyPrice()
                + "\nRoom Type:\t"
                + getRoomType();
    }



}
