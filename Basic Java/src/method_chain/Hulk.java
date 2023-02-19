package method_chain;

public class Hulk {
	public static void main(String[] args) {
		
		Thor t = new Thor();
		
		Venom n = t.d();
		
		 Ironman i = n.b();
		 
		 i.a();
           
		 // Method chaining
	     t.d().b().a();
	
	}

}
