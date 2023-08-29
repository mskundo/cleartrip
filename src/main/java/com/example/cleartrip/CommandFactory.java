package com.example.cleartrip;

import com.example.cleartrip.models.CommandDefination;
import com.example.cleartrip.models.Interface;
import com.example.cleartrip.models.Location;
import com.example.cleartrip.models.SmartHome;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Component
public class CommandFactory {
//this could be done using factory design patter
    public static String getCommand(String command){
        if(CommandList.getCommandList().contains(command)) {
            if("Add_interface_device".equalsIgnoreCase(command)) {
                Scanner s = new Scanner(System.in);
                String interfaceName = s.nextLine();
                String location = s.nextLine();
                return output(interfaceName, null,location);
            }
            if("Add_smarthome_device".equalsIgnoreCase(command)) {
                Scanner s = new Scanner(System.in);
                String smartHomeName = s.nextLine();
                String location = s.nextLine();
                return output(null, smartHomeName,location);
            }

            if("Give_command".equalsIgnoreCase(command)) {
                Scanner s = new Scanner(System.in);
                String smartHomeName = s.nextLine();
                String location = s.nextLine();
                return output(null, smartHomeName,location);
            }

        }

        return  "Invalid input";
    }

    private static String output(String interfaceName, String smartHomeName,String location) {
        Map<String, CommandDefination> interfaceDevices = new HashMap<>();
        Interface interfaceDetails = new Interface();
        Location locations = new Location();
        SmartHome smartHome = new SmartHome();
        if(interfaceDetails.getDevices().contains(interfaceName) && locations.getLocations().contains(location)) {
            return "Added Input";
        }

        if(smartHome.getDevices().contains(smartHomeName) && locations.getLocations().contains(location)) {
            return "Added Input";
        }
        return "Invalid input";
    }
}
