public class PremiumRoom extends Room{
    private static final RoomType ROOM_TYPE = RoomType.Premium;

    public PremiumRoom(Hotel hotel, String room_number) {
        super(hotel, room_number);
    }

    public RoomType getRoomType(){
        return ROOM_TYPE;
    }

}
