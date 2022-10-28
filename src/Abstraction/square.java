package Abstraction;

public class square extends shape {
	int a;
	void area()
	{
		System.out.println(a*a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square s=new square();
		s.a=10;
		s.area();

	}

}
