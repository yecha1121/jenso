
public class ThreadB extends Thread {
	int total; 
	
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(i+"�� ���մϴ�");
				total += i;
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			notify();
		}
	}
}
