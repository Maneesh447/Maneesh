package Abstraction;

class cube implements Maths {
	int side;
	public void circumstance()
	{
		System.out.println(side*side*side);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cube c=new cube();
		c.side=5;
		c. circumstance();

	}

}
