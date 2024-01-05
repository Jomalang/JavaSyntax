
class EX6_4 {
	public static void main(String args[]) {
		MyMath mm = new MyMath();
		long ret1 = mm.add(5L, 3L);
		long ret2 = mm.subtract(5L, 3L);
		long ret3 = mm.multiply(5L, 3L);
		double ret4 = mm.divide(5, 3);
		mm.printgugudan();
		
		
		System.out.println("add = "+ret1);
		System.out.println("subtract = "+ret2);
		System.out.println("multiply = "+ret3);
		System.out.println("divide = "+ret4);
	}
}


class MyMath{
	void printgugudan()
	{
		for(int i = 1; i < 10; i++)
		{
			for(int j = 1; j < 10; j++)
			{
				System.out.printf("%d * %d = %d\n", i, j, i*j);	
			}
			
		}
	}
	long add(long a, long b) 
	{
		return a+b;
	}
	long subtract(long a, long b)
	{
		return a-b;
	}
	long multiply(long a, long b)
	{
		return a*b;
	}
	double divide(double a, double b)
	{
		return a/b;
	}
}
