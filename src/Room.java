public abstract class Room {
    private Hotel hotel;
    private String room_number;
    protected double dailyPrice;

    public Room(Hotel hotel,String room_number){
        this.hotel=hotel;
        this.room_number=room_number;
    }

    public Hotel getHotel(){
        return hotel;
    }

    public double getDailyPrice() {
        return dailyPrice;
    }

    public String getRoom_number() {
        return room_number;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public void setDailyPrice(double price) {
        this.dailyPrice = price;
    }

    public void setRoom_number(String room_number) {
        this.room_number = room_number;
    }


    public abstract RoomType getRoomType();
}

