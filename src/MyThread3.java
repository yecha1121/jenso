
public class MyThread3 implements Runnable{
	String str;
	public MyThread3(String str) {
		this.str = str;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(str);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
