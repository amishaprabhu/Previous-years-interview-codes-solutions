Given a string check whether the alternate characters starting from index 0 are same.
If same the return 1 else return 0.
  
Code:

import java.util.*;
import java.lang.*;
public class Main
{
    public static int numeric(String p)
    {
        char r=p.charAt(0);
        int q=1;
        for(int i=0;i<p.length();i+=2)
	    {
	        if(p.charAt(i)!=r)
	        {
	            q=0;
	            break;
	        }
	    }
	    if(q==0)
	    {
	        return 0;
	    }
	    else
	    {
	        return 1;
	    }
    }
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    String p=s.next();
	    int q=numeric(p);
		System.out.println(q);
	}
}

Output:

MADAM
0

ADAOAS
1
