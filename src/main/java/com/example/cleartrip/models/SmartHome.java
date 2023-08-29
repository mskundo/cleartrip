package com.example.cleartrip.models;

import java.util.ArrayList;
import java.util.List;

public class SmartHome {

    private List<String> devices;
    private Interface anInterface;

    public List<String> getDevices() {
        List<String> smartDevice = new ArrayList<>();
        smartDevice.add("Lights");
        smartDevice.add("Fans");
        return smartDevice;
    }

    public void setDevices(List<String> devices) {
        this.devices = devices;
    }

    public Interface getAnInterface() {
        return anInterface;
    }

    public void setAnInterface(Interface anInterface) {
        this.anInterface = anInterface;
    }
}
