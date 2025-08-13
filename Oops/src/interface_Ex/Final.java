package interface_Ex;

public class Final {
	
	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		Playable audio = audioPlayer;
		audio.play();
	
		
		Recordable recordAudio = audioPlayer;
		recordAudio.record();
		System.out.println();
		
		VideoPlayer vedioPlayer = new VideoPlayer();
		Playable vedio = vedioPlayer;
		vedio.play();
		
        Streamable stream = vedioPlayer;
		stream.stream();
		System.out.println();
		
		Camera camera = new Camera();
		Recordable cam = camera;
		cam.record();
		
		Streamable cam1 = camera;
		cam1.stream();
		
		
	}

}
