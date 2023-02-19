package stringmethods;

public class Equals {
	public static void main(String args[]) {
		String a = "Velocity";
		String b = "velocity";
		
		String c = new String ("Velocity");
		String d = new String ("Velocity");
		
		boolean e = a.equals(c);
		System.out.println(e);
		
		e = c.equals(b);
		System.out.println(e);
         
		
		e = a.equalsIgnoreCase(b);
		System.out.println(e);

    }
}