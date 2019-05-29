package travelagent;

/**
 * This is HotelLocation Class
 * this class is used to create a new location for the hotel
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public class HotelLocation {

    private String province;
    private String description;
    private String city;
    private String landmark;
    private String address;
    private int id;
    private int fromAirport;

    /**
     * This is the constructor of HotelLocation
     * @param province hotel's province
     * @param description hotel location's description
     * @param city city
     */
    public HotelLocation(String province,String description, String city){
        this.city=city;
        this.description=description;
        this.province=province;
    }

    public HotelLocation(int id,String address, String City, String landmark, int fromAirport){
        this.id=id;
        this.address=address;
        this.city=city;
        this.landmark=landmark;
        this.fromAirport=fromAirport;
    }

    /**
     * This method is used to get the location's city
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * This method is used to get the location's description
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method is used to get the location's province
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method is used to set/update the location's city
     * @param city city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method is used to set/update the location's description
     * @param description description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method is used to set/update the location's province
     * @param province province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method is used to display the location's detail
     * @return String
     */
    public String toString(){
        return "City:\t"
                + getCity()
                + "\nProvince:\t"
                + getProvince()
                + "\nDescription:\t"
                + getDescription();
    }
}
