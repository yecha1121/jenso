import java.util.Date;
import java.util.GregorianCalendar;

public class Date02 {
	public static void main(String[] args) {
		Date d1 = new GregorianCalendar(1999,11,31,23,59).getTime();
		Date d2 = new Date();
		long diff = d2.getTime() - d1.getTime();
		System.out.println(diff/(1000*60*60*24));
		System.out.println(d2);
		System.out.println(d1);
		
		if(d1.equals(d2)) {
			System.out.println("same");
		}else if(d1.before(d2)) {
			System.out.println("before");
			
		}else if(d1.after(d2)) {
			System.out.println("after");
		}
		
		System.out.println();
		if(d2.equals(d1)) {
			System.out.println("same");
		}else if(d2.before(d1)) {
			System.out.println("before");
			
		}else if(d2.after(d1)) {
			System.out.println("after");
		}
		
	}
}
