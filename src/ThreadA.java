
public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();
		
		synchronized(b) {
			System.out.println("b�� �Ϸ� �ɶ� ���� ��ٸ��ϴ�");
			try {
				b.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(b.total);
		}
	}
}
