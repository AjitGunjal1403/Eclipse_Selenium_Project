package stringmethods;

public class Is_empty {
	public static void main(String args[]) {
		String a = ("Velocity");
		String b ="";
		
		String c = " ";
	    String d = null ;
	    
	  boolean e = a.isEmpty();
	  System.out.println(e);
	  
	   e = b.isEmpty();
	  System.out.println(e);
	  
	  e = c.isEmpty();
	  System.out.println(e);
	  
	  e = d.isEmpty();
	  System.out.println(e);
	}
}
