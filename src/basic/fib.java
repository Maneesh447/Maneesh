package basic;

public class fib {
	int a;
	int b=-1;
	int c=1;
	void fib()
	{
		for(int i=1;i<=7;i++)
		{
			a=b+c;
			System.out.println(a);
			b=c;
			c=a;
		}
	}
	public static void main(String[] args) {
		fib m1=new fib();
		m1.a=5;
		m1.fib();
	}

}
 