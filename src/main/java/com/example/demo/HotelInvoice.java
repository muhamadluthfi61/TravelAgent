package travelagent;

import java.util.ArrayList;

/**
 * This is Hotel Invoice Class
 * this class is a sub class of Invoice Class.
 * this class is used to create a new Hotel Invoice
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public class HotelInvoice extends Invoice {
    private ArrayList<Integer> number = new ArrayList<>();

    /**
     * This is the constructor of HoteInvoice class.
     * @param customer customer
     */
    public HotelInvoice(Customer customer){
        super(customer);
        ArrayList<HotelReservation> hotelReservations = DatabaseReservation.getHotelReservation(customer);
        for(HotelReservation hotelDB : hotelReservations)
        {
            if(hotelDB.isActive()==true) {
                super.setTotalPrice(hotelDB.getPrice());
                this.number.add(hotelDB.getId());
            }
        }

    }
}
