package basic;

public class ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,8,10,20,14,13,3,4,1};
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
			//System.out.println(a[i]);
		}
		System.out.println(max);
	}
}
