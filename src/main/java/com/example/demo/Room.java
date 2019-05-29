package travelagent;

import travelagent.Hotel;
import travelagent.RoomType;

/**
 * This is Room Class
 * this class is used to create Room Object
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public abstract class Room {
    private Hotel hotel;
    private int room_number;
    protected int dailyPrice;
    private boolean isVacant;

    /**
     * This is the constructor of Room Class
     * @param hotel hotel
     * @param room_number room number
     * @param dailyPrice daily price
     */
    public Room(Hotel hotel,int room_number,int dailyPrice){
        this.hotel=hotel;
        this.room_number=room_number;
        this.dailyPrice=dailyPrice;
        this.isVacant=true;
    }

    /**
     * This method is used to get hotel information
     * @return hotel
     */
    public Hotel getHotel(){
        return hotel;
    }

    /**
     * This method is used to get room's daily price
     * @return daily price
     */
    public int getDailyPrice() {
        return dailyPrice;
    }

    /**
     * This method is used to get room number
     * @return room number
     */
    public int getRoom_number() {
        return room_number;
    }

    /**
     * This method is used to get the status of the room (Vacant or Not)
     * @return true/false
     */
    public boolean getIsVacant(){ return isVacant; }

    /**
     * This method is used to set/update the hotel information
     * @param hotel hotel
     */
    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    /**
     * This method is used to set/update the daily price of a room
     * @param price price
     */
    public void setDailyPrice(int price) {
        this.dailyPrice = price;
    }

    /**
     * This method is used to set/update the room number
     * @param room_number room number
     */
    public void setRoom_number(int room_number) {
        this.room_number = room_number;
    }

    /**
     * This method is used to set/update the status (Vacant or Not) of the room
     * @param isVacant status
     */
    public void setIsVacant(boolean isVacant){ this.isVacant=isVacant; }

    /**
     * This method is used to get the type of room
     * @return room type
     */
    public abstract RoomType getRoomType();
}

