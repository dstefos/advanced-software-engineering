import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
	public static void testFunction(String msg, ArrayList<String> errors) {
		System.out.println("Testing "+msg+": ");
		if(errors.size()>0) {
			System.out.println(Arrays.toString(errors.toArray()));
			System.out.println("Errors count: "+errors.size());
		}
		else System.out.println("OK");
		System.out.println();
	}
}
