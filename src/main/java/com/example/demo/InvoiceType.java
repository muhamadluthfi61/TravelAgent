package travelagent;

/**
 * This is InvoiceType Enumeration
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public enum InvoiceType {
    Flight("Flight"),Hotel("Hotel");
    String list;

    InvoiceType(String type){
        this.list=type;
    }

    /**
     * This method is used to convert enumeration into String
     * @return String
     */
    public String toString(){
        return list;
    }
}
