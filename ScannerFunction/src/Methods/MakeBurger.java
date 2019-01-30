package Methods;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MakeBurger {
	String egg=null;
	String cheese=null;
	String steak=null;
	int qty;
	//1st method declare which will return egg and the type of egg is string 
	public String abc(String e) {
	e=egg;
	return egg;
	}
	//2nd
	public String def(String c) {
		c=cheese;
		return cheese;
	}
public String ghi(String s) {
	s=steak;
	return steak;
	
}
public int jkl(int q) {
	return q;
	
}
	public static Void main(String[]args) {
		
		MakeBurger bur =new MakeBurger();
		bur.abc("white");
		bur.def("mozz");
		bur.ghi("Red");
		bur.jkl(5);
		System.out.println(bur.abc());
	
	}
	
	}
	
	


