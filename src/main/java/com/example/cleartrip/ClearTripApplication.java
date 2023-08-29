package com.example.cleartrip;


import com.example.cleartrip.models.ActivationKeyword;
import com.example.cleartrip.models.Interface;
import com.example.cleartrip.models.SmartHome;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ClearTripApplication {

	private  SmartHome smartHome;
	private  Interface anInterface;
	private ActivationKeyword activationKeyword;

	@Autowired
	public ClearTripApplication(SmartHome smartHome, Interface anInterface, ActivationKeyword activationKeyword) {
		this.activationKeyword=activationKeyword;
		this.anInterface = anInterface;
		this.smartHome = smartHome;
	}

    public static void main(String[] args) {

		SmartHome smartHome = new SmartHome();
		List<String> smartDevice = new ArrayList<>();
		smartDevice.add("Lights");
		smartDevice.add("Fans");
		smartHome.setDevices(smartDevice);
		Interface interfaceDevice = new Interface();
		List<String> list = new ArrayList<>();
		list.add("Google Home");
		interfaceDevice.setDevices(list);
		smartHome.setAnInterface(interfaceDevice);
		ActivationKeyword activationKeyword= new ActivationKeyword();
		List<String>  key = new ArrayList<>();
		key.add("OK Google");
		activationKeyword.setKeywords(key);
		interfaceDevice.setKey(activationKeyword);
		smartHome.setAnInterface(interfaceDevice);
		Scanner s = new Scanner(System.in);
		String activation = s.nextLine();
		if(activationKeyword.getKeywords().contains(activation)) {
			String defination = s.nextLine();
			String output = CommandFactory.getCommand(defination);

		}
	}

}