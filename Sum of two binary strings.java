/*Here we calculate sum of two binary strings.

Approach in java:

We have the inbuilt functions which we can make use of to solve this problem.

1. Take 2 input binary strings
2. Convert those into decimal and add them.
3. Now store the result into another integer variable.
4. Convert that integer no into binary string and we get our final result.*/


Code:

public class Main
{
	public static void main(String[] args) 
	{
	    String a="100";
	    String b="11";
	    int c=Integer.parseInt(a,2)+Integer.parseInt(b,2);
	    System.out.println(Integer.parseInt(a,2)+" "+Integer.parseInt(b,2));
	    String d=Integer.toBinaryString(c);
		System.out.println(d);
	}
}
