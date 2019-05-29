package travelagent.controller;
import travelagent.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HotelReservationController {

    @RequestMapping(value = "/newhotelreservation",method = RequestMethod.POST)
    public HotelReservation newHotelReservation(@RequestParam(value = "room") Room room,
                                                @RequestParam(value = "totalday") int totalday,
                                                @RequestParam(value = "custom id") int customid
                                                )
    {
        HotelReservation hotelReservation = new HotelReservation(room, totalday,DatabaseCustomer.getCustomer(customid));
        hotelReservation.setPrice();
        try {
            DatabaseReservation.addHotelReservation(hotelReservation);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return hotelReservation;
    }

    @RequestMapping(value = "/gethotelreservation", method = RequestMethod.GET)
    public ArrayList<HotelReservation> getHotelReservation(){
        return DatabaseReservation.getHotelReservationDatabase();
    }

    @RequestMapping(value = "/gethotelreservation/{id_reservation}", method = RequestMethod.GET)
    public HotelReservation getHotelReservation(@PathVariable int id_reservation){
        return DatabaseReservation.getHotelReservation(id_reservation);
    }
}
