package com.example.demo.controller;

import com.example.demo.model.Flight;
import com.example.demo.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FlightController {
    private FlightService flightService;

    @Autowired
    public void setFlightService(FlightService flightService) {
        this.flightService = flightService;
    }

    @RequestMapping("/flight")
    public String FlightList (Model model)
    {
        model.addAttribute("flight", flightService.listFlight());
        return "flight";
    }

    @RequestMapping(value = "/flight/create", method = RequestMethod.GET)
    public String FlightForm(Model model)
    {
        model.addAttribute("flight", new Flight());
        return "formFlight";
    }

    @RequestMapping(value = "/flight/create", method = RequestMethod.POST)
    public String FlightAdd(Model model, Flight flight)
    {
        model.addAttribute("flight", flightService.saveOrUpdateFlight(flight));
        return "redirect:/flight";
    }
}
