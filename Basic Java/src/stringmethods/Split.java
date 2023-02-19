package stringmethods;

public class Split {
	public static void main(String args[]) {
		String a = "Velocity";
		String b ="";
		
		String c = " ";
	    String d = null ;
	
	   String [] e = a.split("o");
	   for(int i = 0 ; i < e.length ; i++)
	   {
		   System.out.println(e[i]);
	   }
	   
	}	

}
