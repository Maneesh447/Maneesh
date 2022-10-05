package basic;
	public class Car {
		String color;
		int length;
		int wheel;
		
		void move() {
			System.out.println("Car is moving");
		}

		public static void main(String[] args) {
			Car benz=new Car();
			System.out.println("Benz Car Details");
			benz.color="Green";
			System.out.println("The color of benz is "+benz.color);
			benz.length=15;
			System.out.println(benz.length);
			benz.wheel=4;
			System.out.println(benz.wheel);
			benz.move();
			System.out.println(" ");
		    Car bmw=new Car();
		    System.out.println("BMW Car Details");
			bmw.color="blue";
			System.out.println(bmw.color);
			bmw.length=17;
			System.out.println(bmw.length);
			bmw.wheel=4;
			System.out.println(bmw.wheel);
			bmw.move();
			
			

		}

	}
