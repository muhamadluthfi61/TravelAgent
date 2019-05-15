import java.util.Date;

public class HotelReservation {
    private int id;
    private double price;
    private Customer customer;
    private Room room;
    private double totalday;
    private Date reservationdate;

    public HotelReservation(int id, Room room,double totalday, Customer customer){
        this.id=id;
        this.customer=customer;
        this.room=room;
        this.totalday=totalday;
        this.reservationdate=new Date();
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public Customer getCustomer(){
        return customer;
    }

    public Room getRoom(){
        return room;
    }

    public double getTotalday() {
        return totalday;
    }

    public Date getReservationDate(){
        return reservationdate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = room.getDailyPrice()*totalday;
    }

    public void setTotalday(double totalday) {
        this.totalday = totalday;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setReservationdate(Date reservationdate) {
        this.reservationdate = reservationdate;
    }
}
