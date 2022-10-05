package basic;

public class EBbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int unit=250;
		int m=100;
		int n=300;
		if(unit<=100)
		{
			System.out.println("NO Cost");
		}
		else if(unit>100 && unit<=200)
		{
			unit=unit-100;
			System.out.println(unit*1.5);
		}
		else if(unit>200 && unit<=500)
		{
			unit=unit-200;
			System.out.println((m*2)+(unit*3));
		}
		else if(unit>500)
		{
			unit=unit-500;
			System.out.println((m*3.5)+(n*4.6)+(unit*6.6));
		}
	}

}
