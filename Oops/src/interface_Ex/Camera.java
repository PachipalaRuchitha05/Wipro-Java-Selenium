package interface_Ex;

class Camera implements  Recordable, Streamable {
	
	@Override
	
	public void record() {
		System.out.println("camera  recording video....");
		
	}
	

	@Override
	public void stream() {
		
		System.out.println("camera streaming live video....");
		
	}
}
