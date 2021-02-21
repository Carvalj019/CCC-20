import java.util.Scanner;
import java.io.*;
public class Shift 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String key = sc.nextLine();
		String word = sc.nextLine();
		if(isShift(key, word))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}//End Main
	
	public static boolean isShift(String key, String word)
	{
		boolean isTrue = false;
		for(int i = 0; i < word.length(); i++)
		{
			if(key.contains(word))
			{
				isTrue = true;
				break;
			}
			else
			{
				word = word.substring(1) + word.charAt(0);
			}
		}
		return isTrue;
	}
}//End Class
