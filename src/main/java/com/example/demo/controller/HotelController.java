package travelagent.controller;

import travelagent.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HotelController {

    @RequestMapping(value="/newhotel" , method = RequestMethod.POST)
    public Hotel newHotel(@RequestParam(value="name") String name,
                          @RequestParam(value="address") HotelLocation address,
                          @RequestParam(value="stars") int stars
                          )
    {
        Hotel hotel = new Hotel(name,address,stars);
        try{
            DatabaseHotel.addHotel(hotel);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return hotel;
    }

    @RequestMapping(value = "/hotel", method = RequestMethod.POST)
    public ArrayList<Hotel> hotelList(){
        return DatabaseHotel.getHotelDatabase();
    }
}
