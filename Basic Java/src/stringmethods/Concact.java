package stringmethods;

public class Concact {
	public static void main(String args[]) {

	String a = "Velocity";
	String b = "velocity";
	
	String c = new String ("Velocity");
	String d = new String ("Batch");
	
	String e = a.concat(d);
	System.out.println(e);
	
	e = a.concat(" Class pune");
	System.out.println(e);
	
	
	}	

}
