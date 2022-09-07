package basic;

public class whilesplit {
	public static void main(String[] args) {
		int num=798631,sum=0;
		while (num>0) {
			int a=num%10;
			sum=sum+a;
		    System.out.println(sum);
		    num=num/10;
		}
	}

}
