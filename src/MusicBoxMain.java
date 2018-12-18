
public class MusicBoxMain {
	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		
		MusicPlayer kang = new MusicPlayer(1,box);
		MusicPlayer lee = new MusicPlayer(2,box);
		MusicPlayer cha = new MusicPlayer(3,box);
		
		kang.start();
		lee.start();
		cha.start(); 
	}
}
