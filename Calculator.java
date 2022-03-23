package week1.day1.classroom;

public class Calculator {
	public int add(int n1,int n2,int n3)
	{
		return n1+n2+n3;
	}
	public int sub(int n3,int n4)
	{
		return n3-n4;
	}
	public double mul(double n3,double n4)
	{
		return n3*n4;
	}
	public float  div(float n1,float n2)
	{
		return n1/n2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc =new Calculator();
		System.out.println(calc.add(1,2,3));
		System.out.println(calc.sub(2,2));
		System.out.println(calc.mul(3,4));
		System.out.println(calc.div(6,2));
	}

}
