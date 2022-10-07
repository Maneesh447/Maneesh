package basic;

public class bingbang {
	public static void main(String[] args) {
		int n=1;
		for(int i=1;n<=20;n++) 
		{
			if(n%3==0 && i%5==0)
			{
				System.out.println("Bing Bang");
			}
			else  if(n%3==0) 
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
}
