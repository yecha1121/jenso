
public class MusicBox {
	public synchronized void playMusicA() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("fun music");
			Thread.sleep(1000);
		}
	}
	public synchronized void playMusicB() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("sad music");
			Thread.sleep(1000);
		}
	}
	public  void playMusicC() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			System.out.println("cafe music");
			Thread.sleep(1000);
		}
	}
	
	
	
	
}
