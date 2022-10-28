package Abstraction;

public class User implements IOS,Android {
public void camera()
	{
		System.out.println("It is a best camera");
	}
public void processor()
{
	System.out.println("It was the best processor");
}
public void specification()
{
	System.out.println("It has lot of specification");
}
public void charger()
{
	System.out.println("It has the fast charger");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		User u=new User();
//		System.out.println("IOS");
//		System.out.println();
//		u.camera();
//		u.processor();
//		System.out.println();
//		System.out.println("Android");
//		System.out.println();
//		u.specification();
//		u.charger();
		IOS Apple=new User();
		System.out.println("IOS");
		System.out.println();
		Apple.camera();
		Apple.processor();
//		System.out.println();
//		Android Redmi=new User();
//		System.out.println("Android");
//		System.out.println();
//		Redmi.specification();
//		Redmi.charger();

	}

}
