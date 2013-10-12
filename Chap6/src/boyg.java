import java.util.*;
import java.io.*;
public class boyg {
public static void main(String[] args) throws FileNotFoundException
{
	Scanner input = new Scanner(new File("tas.txt"));
	
	boyGirl(input);
}
public static void boyGirl(Scanner input)
{
	String prevIncrement = "galTotal";
	int boycount= 0;
	int galcount=0;
	int boytotal =0;
	int galtotal = 0;
	while(input.hasNext())
	{
		if( prevIncrement.equals("boyCount")) {
			boytotal += input.nextInt();
			prevIncrement = "boyTotal";
		} else if(prevIncrement.equals("boyTotal"))
		{
			input.next();
			galcount +=1;
			prevIncrement = "galCount";
		} else if(prevIncrement.equals("galCount"))
		{
			galtotal +=input.nextInt();
			prevIncrement = "galTotal";
		} else if(prevIncrement.equals("galTotal"))
		{
			input.next();
			boycount +=1;
			prevIncrement = "boyCount";
		}
	}
	System.out.println( boycount + " " + boytotal + " " + galcount + " " + galtotal);
	int diff = galtotal - boytotal;
	System.out.println(diff);
}
}
