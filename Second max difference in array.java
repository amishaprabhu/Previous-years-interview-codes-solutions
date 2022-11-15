/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class Main
{
    public static int difference(int[] a)
    {
        int seconddifference=0;
        for(int i=0;i<a.length;i++)
        {
            int temp=0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        seconddifference=a[a.length-1]-a[1];
        return seconddifference;
    }
	public static void main(String[] args) 
	{
	    Scanner s=new Scanner(System.in);
	    int a[]={14,12,70,15,95,65,22,30};
	    int secondmax=difference(a);
		System.out.println(secondmax);
	}
}
