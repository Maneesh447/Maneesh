package basic;

public class fibonacii {
	public static void main(String[] args) {
		int a,b=-1;
		int c=1;
		for(int i=1;i<=7;i++)
		{
			a=b+c;
			System.out.println(a);
			b=c;
			c=a;
		}
	}

}
