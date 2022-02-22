package Max_of_3_Nos;

public class ExceptionH {

	public static void main(String[] args) 
	{
		try
		{
		int a=5/0;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("Exception Handled");

	}

}
