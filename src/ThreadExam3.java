
public class ThreadExam3 {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("&&&&&");
		MyThread t2 = new MyThread("%%%%%");
		
		//thread를 상속 받은 것이 아니라
		//runnable을 인터페이스 한것이기에 
		//start() 라는 메소드가 없고 
		//run()메소드만 존재한다
		
		Thread thread1 = new Thread(t1);
		//하지만 start()를 사용해서 시작할수 있다!!
		//Thread에서 Runnable아이를 넣어서 사용한다
		Thread thread2 = new Thread(t2);
		
		thread1.start();
		thread2.start();
		System.out.println("main end!!!");
	}
}
