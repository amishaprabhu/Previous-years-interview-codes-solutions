Input: An alphanumeric string is provided 
Output: Ouptut a string which contains the index values of the numeric characters present in the string.

Code:

import java.util.*;
import java.lang.*;
public class Main
{
    public static String numeric(String p)
    {
        char[] r=p.toCharArray();
        String q="";
        for(int i=0;i<r.length;i++)
	    {
	        if(Character.isDigit(r[i]))
	        {
	            q=q+i;
	        }
	    }
	    return q;
    }
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    String p=s.next();
	    String q=numeric(p);
		System.out.println(q);
	}
}


Input
012ABDH52

Output:
01278
