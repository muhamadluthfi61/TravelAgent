package travelagent;
import java.util.ArrayList;

/**
 * This is the sub-class of Invoice
 * this sub class is used to create flight invoice
 * @author Cahyadi Bayu Saputro, Muhammad Luthfi Mufadel, Jihad Rafsanjani, Afhdal Kurniawan
 * @version 26/05/2019
 */
public class FlightInvoice extends Invoice {

    private ArrayList<Integer> number = new ArrayList<>();

    /**
     * This is the constructor of flight invoice
     * @param customer customer
     */
    public FlightInvoice(Customer customer) {
        super(customer);
        ArrayList<FlightReservation> flight = DatabaseReservation.getFlightReservation(customer);
        for(FlightReservation flightDB : flight)
        {
            if(flightDB.isActive()==true) {
                super.setTotalPrice(flightDB.getTotalPrice());
                this.number.add(flightDB.getId());
            }
        }
    }
}
