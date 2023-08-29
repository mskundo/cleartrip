package com.example.cleartrip.models;

import java.util.ArrayList;
import java.util.List;

public class Interface {

    private List<String> devices;

    private ActivationKeyword key;

    public List<String> getDevices() {
        List<String> list = new ArrayList<>();
        list.add("Google Home");
        return list;
    }

    public void setDevices(List<String> devices) {
        this.devices = devices;
    }

    public void addDevice(String device){
        List<String> d = this.devices;
        d.add(device);
    }

    public ActivationKeyword getKey() {
        return key;
    }

    public void setKey(ActivationKeyword key) {
        this.key = key;
    }
}
