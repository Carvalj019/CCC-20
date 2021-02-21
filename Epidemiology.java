import java.util.Scanner;
public class Epidemiology 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Gets input 
		int limit = sc.nextInt();
		int first = sc.nextInt();
		int rate = sc.nextInt();
		
		
		int infected = first; //Holds total count
		int count = 0; //Initialized as day 0
		while(infected <= limit)
		{
			count++;
			//Uses exponential growth formula (y = ab^x)
			infected += first * (Math.pow(rate, count));
			
		}
		
		System.out.println(count);
	}//End Main
}//End Class
