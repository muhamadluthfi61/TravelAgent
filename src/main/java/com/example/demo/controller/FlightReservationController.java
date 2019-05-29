package travelagent.controller;

import travelagent.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class FlightReservationController {

    @RequestMapping(value = "/newflightreservation", method= RequestMethod.POST)
    public FlightReservation newFlightReseravtion(@RequestParam(value="customid") int customId,
                          @RequestParam(value="flightid") int flightId,
                          @RequestParam(value="seatclass") int seatClass,
                          @RequestParam(value="people") int people
    )
    {
        if(seatClass==1)
        {
            SeatClasses seat = SeatClasses.Economy;
            FlightReservation flightReservation = new FlightReservation(DatabaseCustomer.getCustomer(customId),DatabaseFlight.getFlight(flightId),seat,people);
            try {
                DatabaseReservation.addFlightReservation(flightReservation,DatabaseCustomer.getCustomer(customId));
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            return flightReservation;
        }else if(seatClass==2)
        {
            SeatClasses seat = SeatClasses.Business;
            FlightReservation flightReservation = new FlightReservation(DatabaseCustomer.getCustomer(customId),DatabaseFlight.getFlight(flightId),seat,people);
            try {
                DatabaseReservation.addFlightReservation(flightReservation,DatabaseCustomer.getCustomer(customId));
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            return flightReservation;
        }else if(seatClass==3)
        {
            SeatClasses seat = SeatClasses.FirstClass;
            FlightReservation flightReservation = new FlightReservation(DatabaseCustomer.getCustomer(customId),DatabaseFlight.getFlight(flightId),seat,people);
            try {
                DatabaseReservation.addFlightReservation(flightReservation,DatabaseCustomer.getCustomer(customId));
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            return flightReservation;
        }
        return DatabaseReservation.getFlightReservation(1);
    }

    @RequestMapping("/getflightreservation")
    public ArrayList<FlightReservation> getFlightReservation() {
        return DatabaseReservation.getFlightReservationDatabase();
    }

    @RequestMapping("/getflightreservation/{id}")
    public FlightReservation getFlightReservation(@PathVariable int id) {
        return DatabaseReservation.getFlightReservation(id);
    }
}
