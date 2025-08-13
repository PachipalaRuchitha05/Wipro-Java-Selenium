package devices;

public class SmartFan implements SmartDevice, Adjustable{
	
	 private boolean isOn;
	    private int speed;
	    
	   public SmartFan() {
	        this.isOn = false;
	        this.speed = 4; 
	    }

	@Override
	public void increaseSetting() {
		 if (isOn && speed < 5) {
	            speed++;
	            System.out.println("Fan speed increased to " + speed + ".");
	        }
	    }
		
	

	@Override
	public void decreaseSetting() {
		 if (isOn && speed > 1) {
	            speed--;
	            System.out.println("Fan speed decreased to " + speed + ".");
	        }
	    }

	@Override
	public void turnOn() {
		 isOn = true;
	        System.out.println("Smart Fan is now on.");
	    }
		
	

	@Override
	public void turnOff() {
		 isOn = false;
	        System.out.println("Smart Fan is now off.");
	    }
	
	public String getDeviceName() {
	    return "Smart Fan";
	}

}
