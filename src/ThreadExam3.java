
public class ThreadExam3 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("&&&&&");
		MyThread t2 = new MyThread("%%%%%");
		
		//thread�� ��� ���� ���� �ƴ϶�
		//runnable�� �������̽� �Ѱ��̱⿡ 
		//start() ��� �޼ҵ尡 ���� 
		//run()�޼ҵ常 �����Ѵ�
		
		Thread thread1 = new Thread(t1);
		//������ start()�� ����ؼ� �����Ҽ� �ִ�!!
		//Thread���� Runnable���̸� �־ ����Ѵ�
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		System.out.println("main end!!!");
	}
}
