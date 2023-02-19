package stringmethods;

public class Replace {
	public static void main(String args[]) {
		String a = "Velocity class Pune Class Branch Katraj Office";
		String b = "velocity";
		
		String c = new String ("Velocity");
	    String d = new String ("Velocity");
	    
	    String e = a.replace('e', 'z');
	    System.out.println(e);
	    
	    e = a.replace("class", "Batch");
	    System.out.println(e);
	}

}
