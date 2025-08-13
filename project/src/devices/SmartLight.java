package devices;

public class SmartLight implements SmartDevice, Adjustable {
	
	 private boolean isOn;
	    private int brightness;
	    
		public SmartLight() {
			this.isOn = false;
			this.brightness = 7;
		}

		@Override
		public void increaseSetting() {
			if (isOn && brightness < 100) {
	            brightness += 1;
	            System.out.println("Brightness increased to " + brightness + "%.");
	        }
		}

		@Override
		public void decreaseSetting() {
			 if (isOn && brightness > 0) {
		            brightness -= 1;
		            System.out.println("Brightness decreased to " + brightness + "%.");
		        }
		    }
		

		@Override
		public void turnOn() {
			isOn = true;
	        System.out.println("Smart Light is on.");
		}

		@Override
		public void turnOff() {
			isOn = false;
	        System.out.println("Smart Light is off.");
		}
		
		public String getDeviceName() {
		    return "Smart Light";
		}

}
