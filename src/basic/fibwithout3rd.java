package basic;

public class fibwithout3rd {
	public static void main(String[] args) {
		int f=-1;
		int s=1;
		//int t;
		for(int i=0;i<=10;i++)
		{
			//t=f+s;
			System.out.println(f+s);
			//f=s;
			//s=t;
			s=f+s;
			f=s-f;
		}
	}

}
