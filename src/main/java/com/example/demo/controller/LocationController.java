package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LocationController {
    private LocationService locationService;

    @Autowired
    public void setLocationService(LocationService locationService) {
        this.locationService = locationService;
    }

    @RequestMapping("/location")
    public String LocationList (Model model)
    {
        model.addAttribute("location", locationService.listLocation());
        return "location";
    }

    @RequestMapping(value = "/location/create", method = RequestMethod.GET)
    public String LocationForm(Model model)
    {
        model.addAttribute("location", new Location());
        return "formLocation";
    }

    @RequestMapping(value = "/location/create", method = RequestMethod.POST)
    public String LocationAdd(Model model, Location location)
    {
        model.addAttribute("location", locationService.saveOrUpdateLocation(location));
        return "redirect:/location";
    }

    @RequestMapping(value = "/location/edit/{id}", method = RequestMethod.GET)
    public String LocationEdit(@PathVariable int id, Model model)
    {
        model.addAttribute("location", locationService.getIdLocation(id));
        return "formLocation";
    }

    @RequestMapping(value = "/location/delete/{id}")
    public String LocationDelete(@PathVariable int id)
    {
        locationService.deleteLocation(id);
        return "redirect:/location";
    }
}
