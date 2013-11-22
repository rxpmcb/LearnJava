public class RandomStr
{
	public static void main(String[] args)
	{
		String result = "";
		String myStr = "Hello";
		for (int i = 0; i < 6; i++)
		{
			int intVal = (int)(Math.random() * 26 + 97);
			System.out.println(Math.random());
			result = result + (char)intVal;
		}
		System.out.println(result);
	}
}
