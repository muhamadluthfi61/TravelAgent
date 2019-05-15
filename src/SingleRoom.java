public class SingleRoom extends Room{
    private static final RoomType ROOM_TYPE = RoomType.Single;

    public SingleRoom(Hotel hotel, String room_number) {
        super(hotel, room_number);
    }

    public RoomType getRoomType(){
        return ROOM_TYPE;
    }

}
