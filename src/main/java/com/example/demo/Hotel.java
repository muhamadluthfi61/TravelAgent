package travelagent;

/**
 * This is Hotel Class.
 * this class is used to create a new hotel
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public class Hotel {
    private int id;
    private String name;
    private HotelLocation address;
    private int stars;

    /**
     * This is the constructor of Hotel class.
     * by insert the necessary paramater, it can create a new hotel object
     * @param name name
     * @param address address/location
     * @param stars stars
     */
    public Hotel(String name, HotelLocation address, int stars) {
        this.id = DatabaseHotel.getLastHotelId()+1;
        this.name = name;
        this.address = address;
        this.stars = stars;
    }

    /**
     * This method is used to get the id of the hotel
     * @return hotel's id
     */
    public int getId() {
        return id;
    }

    /**
     * This method is used to get the name of the hotel
     * @return hotel's name
     */
    public String getName() {
        return name;
    }

    /**
     * This method is used to get the location of the hotel
     * @return hotel's location
     */
    public HotelLocation getAddress() {
        return address;
    }

    /**
     * This method is used to get the rating of the hotel
     * @return hotel's rating
     */
    public int getStars() {
        return stars;
    }

    /**
     * This method is used to set/update id of hotel
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * This method is used to set/update the hotel's name
     * @param name hotel's name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method is used to set/update the hotel's location
     * @param address hotel's location
     */
    public void setAddress(HotelLocation address) {
        this.address = address;
    }

    /**
     * This method is used to set/update the rating of hotel
     * @param stars hotel's rating
     */
    public void setStars(int stars) { this.stars = stars; }

    /**
     * This method is used to display the details of hotel
     * @return String
     */
    public String toString(){
        return "Hotel ID:\t"
                + getId()
                + "\nNama Hotel\t:"
                + getName()
                + "\nLokasi\t\t"
                + address.getCity()
                + "\nBintang\t\t"
                + getStars();
    }
}
