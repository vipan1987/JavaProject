package Methods;

import java.nio.channels.MulticastChannel;
import java.util.Scanner;

import javax.xml.ws.AsyncHandler;

public class Pizza {
	String cheese=null;
	String crust=null;
	String sauce=null;
	int qty;
	
	public String cheese(String c) {  
		
	cheese=c;
		return cheese;
	}
	
	public String crust(String r) {
		crust=r;
		return crust;
		}
	public String sauce(String s) {
	   sauce=s;
	return s;
	}
	public int qty(int num) {
		return num;
		
		}
	public static void main(String[]args) {
		Pizza p=new Pizza();
		p.cheese("mozerella");
		p.crust("thin");
		p.sauce("red");
		p.qty(5);
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("what type cheese do you want:");
		String	c=scanner.next();
		System.out.println("how MulticastChannel do you want");
		int num=scanner.nextInt();
		System.out.println(p.cheese(c));
		System.out.println(p.qty(num));
		
		
	}
	
	
	
	

}
