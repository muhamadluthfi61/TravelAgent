public class HotelLocation {

    private String province;
    private String description;
    private String city;

    public HotelLocation(String province,String description, String city){
        this.city=city;
        this.description=description;
        this.province=province;
    }

    public String getCity() {
        return city;
    }

    public String getDescription() {
        return description;
    }

    public String getProvince() {
        return province;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
