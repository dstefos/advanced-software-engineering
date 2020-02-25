import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Tester {
	
	public static void main(String[] args) throws IOException {

		
		int failedTestsCount=0;
		
		failedTestsCount+=GUIBuilder.test()>0?1:0;
		System.out.println();
		failedTestsCount+=CSVParser.test()>0?1:0;
		
		System.out.println();
		System.out.println("Total Functions Failed: "+failedTestsCount);
	}
	
	public static int testFunction(String msg, int errors) {
		System.out.println("Testing "+msg+": ");
		if(errors>0) {
			System.out.println("Errors count: "+errors);
			System.out.println();
			return 1;
		}
		
		System.out.println("OK");
		System.out.println();
		return 0;
	}
	
	public static int compare(String msg, Object obj1, Object obj2) {
		if(!obj1.equals(obj2)) {
			System.out.println(msg+" error. Expected: "+obj1+" but got: "+obj2);
			return 1;
		}

		System.out.println(msg+": OK");
		return 0;

	}
}
