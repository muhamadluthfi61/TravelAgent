package travelagent;
/**
 * This is SingleRoom Class that is a sub class of Room Class
 * this class is used to create Room Object with roomtype = Single
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public class SingleRoom extends Room{
    private static final RoomType ROOM_TYPE = RoomType.Single;

    /**
     * This is the constructor of the SingleRoom
     * @param hotel hotel
     * @param room_number room number
     * @param dailyPrice daily price
     */
    public SingleRoom(Hotel hotel, int room_number, int dailyPrice) {
        super(hotel, room_number,dailyPrice);
    }

    /**
     * This method is used to get the type of room
     * @return room type
     */
    public RoomType getRoomType(){
        return ROOM_TYPE;
    }

    /**
     * this method is used to display the room's detail
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
