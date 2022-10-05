package basic;

public class fact {
	int a;
	int fact=1;
	void fact()
	{
		for(int i=1;i<=a;i++)
		{
		 fact=fact*i;	
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		fact s1=new fact();
		s1.a=5;
		s1.fact();
	
	}
}
