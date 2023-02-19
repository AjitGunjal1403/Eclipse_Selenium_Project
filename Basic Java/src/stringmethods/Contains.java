package stringmethods;

public class Contains {
	public static void main(String args[]) {
		String a = "Velocity Class Pune Branch Katraj Office";
		String b = "velocity";
		
		String c = new String ("Velocity");
	    String d = new String ("Velocity");
	    
	    
	    boolean e = a.contains("class");
	    System.out.println(e);
	    
	    e = a.contains("Class");
	    System.out.println(e);
	    
	    e = b.contains("o");
	    System.out.println(e);
	}

}
