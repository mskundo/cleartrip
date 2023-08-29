package com.example.cleartrip.models;

import java.util.ArrayList;
import java.util.List;

public class Location {

    private List<String> locations;

    public List<String> getLocations() {
        List<String> list = new ArrayList<>();
        list.add("Living Room");
        list.add("Drawing Room");
        return list;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }
}
