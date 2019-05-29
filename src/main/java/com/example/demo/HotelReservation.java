package travelagent;
import java.util.Date;

/**
 * This is Hotel Reservation class
 * this class is used to crea a hotel reservation
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public class HotelReservation {
    private int id;
    private int price;
    private Customer customer;
    private Room room;
    private int totalday;
    private boolean isActive;

    /**
     * This is the constructor of Hotel Reservation Class
     * this constructor is used to create reservation by inserting the necessary parameter.
     * @param room room
     * @param totalday total day of staying
     * @param customer customer
     */
    public HotelReservation(Room room,int totalday, Customer customer){
        this.id=DatabaseReservation.getLastReservationId();
        this.customer=customer;
        this.room=room;
        this.totalday=totalday;
        this.isActive=true;
    }

    /**
     * This method is used to get the id of Hotel reservation
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * This method is used to get the price of the reservation
     * @return price
     */
    public int getPrice() {
        return price;
    }

    /**
     * This method is used to get the customer that reserve the hotel.
     * @return customer
     */
    public Customer getCustomer(){
        return customer;
    }

    /**
     * This method is to get the detail of room detail
     * @return room
     */
    public Room getRoom(){
        return room;
    }

    /**
     * This method is used to get the totak day of stay
     * @return totalday
     */
    public int getTotalday() {
        return totalday;
    }

    /**
     * This method is used to get the status of reservation
     * @return true or false
     */
    public boolean isActive() {
        return isActive;
    }

    /**
     * This method is used to set/update the reservation's id
     * @param id id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * This method is used to set/update the price of reservation
     */
    public void setPrice() {
        this.price = room.getDailyPrice()*totalday;
    }

    /**
     * This method is used to set/update the total day of stay
     * @param totalday total day
     */
    public void setTotalday(int totalday) {
        this.totalday = totalday;
    }

    /**
     * This method is used to set/update customer
     * @param customer customer
     */
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    /**
     * This method is used to set/update the room
     * @param room room
     */
    public void setRoom(Room room) {
        this.room = room;
    }

    /**
     * This method is used to set/update the status of reservation
     * @param active status
     */
    public void setActive(boolean active) {
        isActive = active;
    }

    /**
     * This method is used to diplay the detail of reservation
     * @return String
     */
    public String toString(){
        return "Hotel Reservation ID:\t"
                + getId()
                + "\nCustomer:\t"
                + getCustomer().getName()
                + "\nRoom Number:\t"
                + getRoom().getRoom_number()
                + "\nRoom Type:\t"
                + getRoom().getRoomType()
                + "\nHotel:\t"
                + getRoom().getHotel().getName()
                + "\nTotal Day:\t"
                + getTotalday()
                + "\nTotal Price:\t"
                + getPrice();
    }
}
