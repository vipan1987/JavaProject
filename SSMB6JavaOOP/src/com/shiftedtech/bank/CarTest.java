package com.shiftedtech.bank;

public class CarTest {

	public static void main(String[] args) {

		//Car car = new Car();
		//Car car2 = new Car("Test1");
		
		BMW bmw = new BMW();
		BMW bm2 = new BMW("Iftekhar's Car") {
			@Override
			public void printName() {
				System.out.println("Hi There");
			}
		
		};
		//bm2.year = -1700;
		//bm2.name = "Test";
	
		//bm2.setYear(1800);
		bm2.printName();
		//bm2.printName(12,"test");
		//bm2.p
		
		Item x = Item.SODA;
		System.out.println("Item Price:" + x.getPrice());
	}

}
