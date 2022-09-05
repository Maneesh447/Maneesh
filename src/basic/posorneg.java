package basic;

public class posorneg {
	public static void main(String[] args) {
		int a=5;
		if(a%2==0 && a<=0)
		{
			System.out.println("Positive Even Number");
		}
		else if(a%2<=0 && a>=0)
		{
			System.out.println("Negative Even Number");
		}
		else if(!(a%2>=0 && a>=0))
		{
			System.out.println("Negative odd Number");
		}
		else if(!(a%2==0 && a>=0))
		{
			System.out.println("Positive Odd Number");
		}
		else
		{
			System.out.println("Error");
		}
			
	}

}
