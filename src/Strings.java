
public class Strings 
{
	public static void main(String[] args)
	{
		//print(stringToInteger("2234")); // should return integer 2234
		//print(integerToString(-232));		//should return "-232"	
		
		print(encoding("ZZ"));
		print(encoding("AAA"));
		print(encoding("Z"));
		print(encoding("ZY"));
		print(encoding("CCC"));
	}

	/*
	 * converts given string to integer. Takes care of cases such as 0 and negative numbers in string
	 */
	public static int stringToInteger(String s)
	{
		int num = 0;
		int power = 0;
		for(int i = s.length() -1; i>=0; i--)
		{
			int c = s.charAt(i) - 48;
			if(c == -3)
			{
				//negative number
				num = num * -1;
			}
			else
			{
				num = (int) (num + c * Math.pow(10, power));
				power++;
			}
		}
		return num;
	}
	/*
	 * converts given integer to string. Takes care of cases such as 0 and negative numbers
	 */
	public static String integerToString(int i)
	{
		int digit = 0;
		String num = "";
		boolean neg = false;
		if(i==0)
		{
			num = num + 0;
		}
		while(i != 0)
		{
			digit = i % 10;
			if(digit < 0)
			{	
				neg = true;
				i = i/10;
				num = (0-digit) + num;				
			}
			else
			{
				i = i/10;
				num = (digit) + num;
			}	
		}
		if(neg)
		{
			num = "-"+num; 
		}
		return num;
		
	}
	/*
	 * Compute spreadsheet column encoding
	 */
	public static int encoding(String col)
	{
		int res = 0;
		for(int i = 0 ; i < col.length(); i++)
		{
			int c = col.charAt(i) - 64;	//because a is 1 not 0
			//if (c - 64)
			res = res * 26 + c;		
			
		}
		return res;
		
	}
	
	public static void print(Object x)
	{
		System.out.println(x.getClass() + " " + x);	
	}
	
}
