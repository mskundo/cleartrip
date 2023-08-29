package com.example.cleartrip;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CommandList {

    public static List<String> getCommandList() {
        List<String> list= Arrays.asList("Add_interface_device", "Add_smarthome_device", "Give_command",
                "Print_connected_device", "Connect_SmartHome_device", "Disconnect_SmartHome_device");
        return list;
    }
}
