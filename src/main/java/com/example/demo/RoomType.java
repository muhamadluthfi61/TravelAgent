package travelagent;

/**
 * This is RoomType Enumeration
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public enum RoomType {
    Single("Single"), Double("Double"), Premium("Premium");
    private String description;

    private RoomType(String s){
        this.description=s;
    }

    /**
     * This method is used to convert enumeration into String
     * @return String
     */
    @Override
    public String toString() {
        return this.description;
    }
}
