
public class ExceptionDemo {

	public static void main(String[] args) {
//		int de = 5;
//		String deno = "Lala";
//		String meno ="Beemla";
//		try {
//			System.out.println(25/de);
//		}catch(Exception e) {
//			System.out.println("Printiong what type of exception" +e.getMessage());
//		}
//		finally {
//			System.out.println("final block is executed");
//		}
//
//		System.out.println(deno+meno);
//	}
		
		
		
		// 2

//		
//		String deno = "Lala";
//		String meno ="Beemla";
//		try {
//			int a = 5;
//			int b=0;
//			int c= a/b;
//			int d[] = {1,2,3,4};
//			System.out.println(d[10]);
//		}catch(ArithmeticException ex) {
//			System.out.println("Arthimetic Exception executed" +ex.getMessage());
//		}catch(ArrayIndexOutOfBoundsException ee) {
//			System.out.println("Array Out of bounds" +ee.getMessage());
//		}
//		catch(NullPointerException na) {
//			System.out.println("Null Point" +na.getMessage());
//		}
//		catch(Exception e) {
//			System.out.println("Printiong what type of exception" +e.getMessage());
//		}
//		finally {
//			System.out.println("final block is executed");
//		}
//
//		System.out.println(deno+meno);
		
		
		//3
		
//
//		String deno = "Lala";
//		String meno ="Beemla";
//		
//		try {
//			int a = 5;
//			int b=0;
////			int c= a/b;
//			int d[] = {1,2,3,4};
//			try {
//			System.out.println(d[10]);
//			}catch(ArrayIndexOutOfBoundsException e) {
//				System.out.println("Null POinter");
//			}
//		}catch(ArithmeticException ex) {
//			System.out.println("Arthimetic Exception executed" +ex.getMessage());
//		}
////		}catch(ArrayIndexOutOfBoundsException ee) {
////			System.out.println("Array Out of bounds" +ee.getMessage());
////		}
////		catch(NullPointerException na) {
////			System.out.println("Null Point" +na.getMessage());
////		}
////		catch(Exception e) {
////			System.out.println("Printiong what type of exception" +e.getMessage());
////		}
//		finally {
//			System.out.println("final block is executed");
//		}
//
//		System.out.println(deno+meno);
		
		try {
			int a = 50;
			int b = 0;
			if(b == 0)
				throw new Exception("Divide by zero causes an Exception");
			int c = b/a;
			System.out.println("Result is : " +c);
		}catch (Exception e) {
			System.out.println("Exception is : " +e);
		}
	}
}
