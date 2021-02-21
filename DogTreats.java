import java.util.Scanner;
public class DogTreats 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int total = 0;
		
		total += 3 * (Integer.parseInt(sc.nextLine()));
		total += 2 * (Integer.parseInt(sc.nextLine()));
		total += (Integer.parseInt(sc.nextLine()));
		sc.close();
		if(total >= 10)
		{
			System.out.println("happy");
		}
		else
		{
			System.out.println("sad");
		}
		
	}//End Main
}//End Class
