package com.example.demo.service;

import com.example.demo.model.*;

import java.util.List;

public interface LocationService {
    List<Location> listLocation();
    Location saveOrUpdateLocation (Location location);
    Location getIdLocation (int id);
    void deleteLocation (int id);
}
