package devices;

public class SmartTv implements SmartDevice, Adjustable{
	
	 private boolean isOn;
	    private int volume;
	    
	    
	    public SmartTv() {
	    	isOn = false;
	    	volume = 8;
	    	
	    }

		@Override
		public void increaseSetting() {
			 if (isOn && volume < 100) {
		            volume++;
		            System.out.println("Volume increased to " + volume + ".");
		        }
		    }

		@Override
		public void decreaseSetting() {
			 if (isOn && volume > 0) {
		            volume--;
		            System.out.println("Volume decreased to " + volume + ".");
		        }
		    }

		@Override
		public void turnOn() {
			 isOn = true;
		        System.out.println("Smart TV is now on.");
		    }

		@Override
		public void turnOff() {
			  isOn = false;
		        System.out.println("Smart TV is now off.");
		    }
		
		public String getDeviceName() {
		    return "Smart TV";
		}

}
