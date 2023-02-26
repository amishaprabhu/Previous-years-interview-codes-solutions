Reverse the string

Code:

public class Main
{
	public static void main(String[] args) {
		String s="Amisha";
		String a="";
		for(int i=s.length()-1;i>=0;i--)
		{
		    a+=s.charAt(i);
		}
		System.out.println(a);
	}
}

Output:

ahsimA
