package basic;

public class DectoBin {
	public static void main(String[] args) {
		int n=12,i=0;
		int b[]=new int[10];
		while(n>0)
		{
			b[i]=n%2;
			System.out.println(b[i]);
			n=n/2;
			i++;
		}
		 System.out.println();
		  for(int j=i-1;j>=0;j--)
		  {
			System.out.println(b[j]);
		  }
		
	}

}
