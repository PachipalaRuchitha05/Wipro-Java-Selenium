package controller;

import devices.SmartDevice;
import devices.Adjustable;
import devices.SmartFan;
import devices.SmartLight;
import devices.SmartTv;

import java.util.ArrayList;
import java.util.List;

import devices.SmartAc;

public class DeviceController {
	
	public void controlDevices() {
		List<SmartDevice> devices = new ArrayList<>();
        devices.add(new SmartLight());
        devices.add(new SmartFan());
        devices.add(new SmartAc());
        devices.add(new SmartTv());

       
        for (SmartDevice device : devices) {
            System.out.println("\nControlling: " + device.getDeviceName());

            device.turnOn();

            if (device instanceof Adjustable adjustable) {
                adjustable.increaseSetting();
                adjustable.decreaseSetting();
            }

            device.turnOff();
		
	}
	
	}
	
}
