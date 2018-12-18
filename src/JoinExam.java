
public class JoinExam {
	public static void main(String[] args) throws InterruptedException {
		MyThread2 thread = new MyThread2();
		thread.start();
		
		System.out.println("start!!!!");
		
		thread.join();
		System.out.println("end!!!!");
	}
}
