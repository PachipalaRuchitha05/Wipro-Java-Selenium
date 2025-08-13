package interface_Ex;

 class VideoPlayer implements Playable , Streamable {
	
	@Override
	
	public void play() {
		System.out.println("vedioplayer playing vedio....");
	}
	
	@Override
	public void stream() {
		System.out.println("vedioplayer streaming vedio....");
	}

}
