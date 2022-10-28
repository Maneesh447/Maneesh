package Abstraction;

public class Citizen {
	void gst()
	{
		System.out.println("16%");
	}
	void traffic()
	{
		System.out.println("Obey The Rules");
	}
	void sgstc()
	{
		System.out.println("9%");
	}
	void tnpsc()
	{
		System.out.println("Government Exam");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Citizen C=new Citizen();
		C.gst();
		C.traffic();
		C.sgstc();
		C.tnpsc();

	}

}
