package travelagent;

/**
 * This is sub-class of Room that is DoubleRoom
 * this class can create a room with type that is double
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public class DoubleRoom extends Room{
    private static final RoomType ROOM_TYPE = RoomType.Double;

    /**
     * This is the constructor of doubleroom
     * @param hotel hotel
     * @param room_number room's number
     * @param dailyPrice daily price of that room
     */
    public DoubleRoom(Hotel hotel, int room_number,int dailyPrice) {
        super(hotel, room_number,dailyPrice);
    }

    /**
     * This method is used to get the type of the room
     * @return ROOM_TYPE
     */
    public RoomType getRoomType(){
        return ROOM_TYPE;
    }

    /**
     * This method is to display the room detail
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
