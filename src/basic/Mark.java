package basic;

public class Mark {
	int m1;
	int m2;
	int m3;
	int m4;
	int m5;
	public static void main(String[] args)
	{
		Mark s1=new Mark();
		s1.m1=75;
		s1.m2=65;
		s1.m3=77;
		s1.m4=65;
		s1.m5=83;
		s1.cal();
		//System.out.println();
		Mark s2=new Mark();
		s2.m1=79;
		s2.m2=81;
		s2.m3=73;
		s2.m4=68;
		s2.m5=79;
		s2.cal();
	}
	void cal()
	{
		System.out.println(m1+m2+m3+m4+m5);
	}

}
