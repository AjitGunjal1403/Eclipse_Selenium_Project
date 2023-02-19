package method_chain2;

public class Strange {
	public static void main(String[] args) {
		Captain_Marvel m = new Panther();
		Natasha g = m.h();
		Wanda e = g.d();
		e.w();
		
		// Method chaining using up casting
		m.h().d().w();
	}

}
