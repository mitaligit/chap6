import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class even {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner input = new Scanner(new File("numbers.txt"));
		
		evenNumbers(input);
	}
	public static void evenNumbers(Scanner input)
	{
		int count = 0;
		int sum =0;
		int counteven =0;
		
		while(input.hasNextInt())
		{
			int num = input.nextInt();
			System.out.println(num);
			sum = sum +num;
			count++;
			if (num%2 ==0)
			{
				
				counteven++;
			}
		}
		int evenpercent = (counteven/count) *100;
		System.out.println("There are :" + count + "number");
		System.out.println("Sum is :" + sum);
		System.out.println("there are :" + counteven + " even numbers");
		System.out.println("percentage is" + evenpercent);
	}
	
}
