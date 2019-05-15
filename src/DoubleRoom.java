public class DoubleRoom extends Room{
    private static final RoomType ROOM_TYPE = RoomType.Double;

    public DoubleRoom(Hotel hotel, String room_number) {
        super(hotel, room_number);
    }

    public RoomType getRoomType(){
        return ROOM_TYPE;
    }

}
