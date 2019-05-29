package travelagent.controller;
import travelagent.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RoomController {

    @RequestMapping(value = "/newsingleroom",method = RequestMethod.POST)
    public Room newSingleRoom(@RequestParam(value="hotel") Hotel hotel,
                              @RequestParam(value = "room_number") int room_number,
                              @RequestParam(value = "dailyPrice") int dailyPrice
                              )
    {
        Room room = new SingleRoom(hotel,room_number,dailyPrice);
        try{
           DatabaseRoom.addRoom(room);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return room;
    }

    @RequestMapping(value = "/newdoubleroom",method = RequestMethod.POST)
    public Room newDoubleRoom(@RequestParam(value="hotel") Hotel hotel,
                              @RequestParam(value = "room_number") int room_number,
                              @RequestParam(value = "dailyPrice") int dailyPrice
    )
    {
        Room room = new DoubleRoom(hotel,room_number,dailyPrice);
        try{
            DatabaseRoom.addRoom(room);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return room;
    }

    @RequestMapping(value = "/newpremiumroom",method = RequestMethod.GET)
    public Room newPremiumRoom(@RequestParam(value="hotel") Hotel hotel,
                              @RequestParam(value = "room_number") int room_number,
                              @RequestParam(value = "dailyPrice") int dailyPrice
    )
    {
        Room room = new PremiumRoom(hotel,room_number,dailyPrice);
        try{
            DatabaseRoom.addRoom(room);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        return room;
    }

    @RequestMapping(value = "/rooms",method = RequestMethod.POST)
    public ArrayList<Room> roomList(){
        return DatabaseRoom.getRoomDatabase();
    }

    @RequestMapping(value = "/rooms/{id_hotel}", method = RequestMethod.GET)
    public ArrayList<Room> roomListByHotel(@PathVariable int id_hotel){
        return DatabaseRoom.getRoomFromHotel(id_hotel);
    }

    @RequestMapping(value = "/rooms/{type_hotel}",method = RequestMethod.GET)
    public ArrayList<Room> roomListByType(@PathVariable String type_hotel){
        return DatabaseRoom.getRoomFromType(type_hotel);
    }

    @RequestMapping(value = "/vacantrooms", method = RequestMethod.GET)
    public ArrayList<Room> roomVacantList(){
        return DatabaseRoom.getRoomThatVacant();
    }





}
