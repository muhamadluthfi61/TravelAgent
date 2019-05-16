public class PremiumRoom extends Room{
    private static final RoomType ROOM_TYPE = RoomType.Premium;

    public PremiumRoom(Hotel hotel, String room_number,double dailyPrice) {
        super(hotel, room_number,dailyPrice);
    }

    public RoomType getRoomType(){
        return ROOM_TYPE;
    }

}
