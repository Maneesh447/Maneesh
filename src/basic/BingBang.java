package basic;

public class BingBang {
	public static void main(String[] args) {
		int n=7;
		if(n%3==0 && n%5==0)
		{
			System.out.println("Bing Bang");
		}
		else if(n%3==0)
		{
			System.out.println("Bing");
		}
		else if(n%5==0)
		{
			System.out.println("Bang");
		}
		else
		{
			System.out.println(n);
		}
		  	
	}
}
