package interface_Ex;

 class AudioPlayer implements Playable, Recordable {
	
	@Override
	
	public void play() {
		System.out.println("Audioplayer playing audio....");
	}
	
	@Override
	
	public void record() {
		System.out.println("Audioplayer recording audio....");
	}

}
