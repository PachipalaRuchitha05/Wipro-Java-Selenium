package devices;

public class SmartAc implements SmartDevice, Adjustable {
	
	private boolean isOn;
	private int temperature;
	
	public SmartAc() {
		
		isOn = false;
		temperature = 24;
	}

	@Override
	public void increaseSetting() {
		   if (isOn && temperature < 30) {
	            temperature++;
	            System.out.println("AC temperature set to " + temperature + "°C.");
	        }
	    }
		
	

	@Override
	public void decreaseSetting() {
		if (isOn && temperature > 16) {
            temperature--;
            System.out.println("AC temperature set to " + temperature + "°C.");
        }
    }

	@Override
	public void turnOn() {
		 isOn = true;
	        System.out.println("Smart AC is now on.");
	    }

	@Override
	public void turnOff() {
		 isOn = false;
	        System.out.println("Smart AC is now off.");
	    }
	
	public String getDeviceName() {
	    return "Smart AC";
	}

}
