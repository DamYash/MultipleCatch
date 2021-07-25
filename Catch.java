public class MultipleCatch 
{
	public static void main(String[] args) 
	{
		try
		{
			int a[] = new int[5];
			System.out.println(a[10]);
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch (Exception e)
		{
			System.out.println("Parent Exception occurs");
		}
		System.out.println("Rest of the code");
	}
}


/**
Output:
Parent Exception occurs
Rest of the code
**/
