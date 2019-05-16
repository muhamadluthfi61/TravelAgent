import java.util.ArrayList;

public class FlightInvoice extends Invoice {

    private ArrayList<Integer> number = new ArrayList<>();

    public FlightInvoice(int id, Customer customer) {
        super(id,customer);
        ArrayList<FlightReservation> flight = DatabaseReservation.getFlightReservation(customer);
        for(FlightReservation flightDB : flight)
        {
            super.setTotalPrice(flightDB.getTotalPrice());
            this.number.add(flightDB.getId());
        }
    }
}
