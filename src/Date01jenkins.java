import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d.toString());
		
		SimpleDateFormat sd = new SimpleDateFormat("yyyy:MM:dd");
		System.out.println(sd.format(d));
		
		System.out.println(d.getTime());
		
		System.out.println();
		long today = System.currentTimeMillis();
		System.out.println(today);
		
		System.out.println(today - d.getTime());
	}
}
