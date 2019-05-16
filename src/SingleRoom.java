public class SingleRoom extends Room{
    private static final RoomType ROOM_TYPE = RoomType.Single;

    public SingleRoom(Hotel hotel, String room_number, double dailyPrice) {
        super(hotel, room_number,dailyPrice);
    }

    public RoomType getRoomType(){
        return ROOM_TYPE;
    }

}
