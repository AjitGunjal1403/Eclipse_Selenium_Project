package stringmethods;

public class Ends_with {
	public static void main(String[] args) {
		String a ="Velocity";
		String b = "Velocity ";
		
		
		boolean e = a.endsWith("ity");
		System.out.println(e);
		
		e = b.endsWith("ity");
		System.out.println(e);
	}

}
