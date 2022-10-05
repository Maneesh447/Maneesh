package basic;

public class findnumofdigit {
	public static void main(String[] args) {
		int n=12;
		int t=0;
		while(n>0) {
			n=n/10;
			t++;
		}
		System.out.print(t);
	}
}
