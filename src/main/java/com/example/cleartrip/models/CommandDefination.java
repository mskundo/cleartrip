package com.example.cleartrip.models;

import java.util.HashMap;
import java.util.Map;

public class CommandDefination {

    private String interfaceName;
    private String activationKey;
    private String location;
    private String smartHomeDevice;
    private String smartHomeLocation;
    private Map<String, SmartHome> connectedDevices = new HashMap<>();

    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public String getActivationKey() {
        return activationKey;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSmartHomeDevice() {
        return smartHomeDevice;
    }

    public void setSmartHomeDevice(String smartHomeDevice) {
        this.smartHomeDevice = smartHomeDevice;
    }

    public String getSmartHomeLocation() {
        return smartHomeLocation;
    }

    public void setSmartHomeLocation(String smartHomeLocation) {
        this.smartHomeLocation = smartHomeLocation;
    }

    public Map<String, SmartHome> getConnectedDevices() {
        return connectedDevices;
    }

    public void setConnectedDevices(Map<String, SmartHome> connectedDevices) {
        this.connectedDevices = connectedDevices;
    }
}
