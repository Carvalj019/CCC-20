import java.util.Scanner;
public class Art 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x[] = new int[n];
		int y[] = new int[n];
		int xMin = 0, xMax = 0, yMin = 0, yMax = 0;
		String temp = "";
		for(int i = 0; i < x.length; i++)
		{
			temp = sc.next();
			x[i] = Integer.parseInt(temp.substring(0, temp.indexOf(",")));
			y[i] = Integer.parseInt(temp.substring(temp.indexOf(",") + 1));
			
		}
		sort(x);
		sort(y);
		
		xMin = x[0] - 1;
		xMax = x[x.length - 1] + 1;
		yMin = y[0] - 1;
		yMax = y[y.length - 1] + 1;
		
		System.out.println(xMin + "," + yMin);
		System.out.println(xMax + "," + yMax);
	}//End Main
	
	public static void display(int array[])
	{
		for(int x: array)
		{
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	public static void sort(int arr[]) 
	{
		int temp = 0;
     	for(int i = arr.length - 1; i >= 1; i--)
		{
     		
			for(int j = 0; j < i; j++)
			{
				if(arr[j] > arr[j + 1])
				{
					//To flip ascending/descending orders, change the greater than/less than sign

					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	} 
}//End Class
