
public class DaemonThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("데몬 스레드가 실행 중입니다");
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
		thread.setDaemon(true);//데몬 스레드로 설정이 되었다
		thread.start();
		
		Thread.sleep(1000);
		System.out.println("메인 스레드가 종료 됩니다");
		
	}
}
