
public class DaemonThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("���� �����尡 ���� ���Դϴ�");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
		}
	}
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new DaemonThread());
		thread.setDaemon(true);//���� ������� ������ �Ǿ���
		thread.start();
		
		Thread.sleep(1000);
		System.out.println("���� �����尡 ���� �˴ϴ�");
		
	}
}
