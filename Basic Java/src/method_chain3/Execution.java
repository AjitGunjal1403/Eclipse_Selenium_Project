package method_chain3;

public class Execution {
	public static void main(String[] args) {
		
	
	Class_E e = new Subclass_F();
	 Class_C g = e.c();
	 Class_A i = g.b();
	 i.d();
	 
	 e.c().b().d();
	
	
	}
}
