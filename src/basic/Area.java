package basic;

public class Area {
	int a;
	void area()
	{
		System.out.println(a*a);
	}
	public static void main(String[] args)
	{
		Area s1=new Area();
		Area s2=new Area();
		s1.a=5;
		s2.a=10;
		s1.area();
		s2.area();
		
	}

}
