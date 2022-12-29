A matrix  A(N*N) is given 
first line of input is N then next N lines contain N space separated values of matrix
Take value of X as input.

  Tasks: 
 1. Find row and column no of value X in matrix A
 2. Sum the value of row and column.
 3. Find element Z which is on the same row as X but towards right on S.
 4. Once Z is found, sum the value of Z using the formula as if value of Z is  "abc" then a^3+b^2+c^1; according to no of digits.
 5. Print this sum P which is calculated.


Input: 

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int N=s.nextInt();
	    int A[][]=new int[N][N];
	    for(int i=0;i<N;i++)
	    {
	        for(int j=0;j<N;j++)
	        {
	            A[i][j]=s.nextInt();
	        }
	    }
	    int X=s.nextInt();
	    int S=0,Z=0,r=0,c=0,p=0,power=1;
	     for(int i=0;i<N;i++)
	    {
	        for(int j=0;j<N;j++)
	        {
	            if(A[i][j]==X)
	            {
	                r=i;
	                c=j;
	                break;
	            }
	        }
	    }
	     S=r+c;
	     Z=A[r][(c+S)%N];
	     while(Z!=0)
	     {
	         int q=Z%10;
	         p=p+(int)(Math.pow(q,power));
	         Z=Z/10;
	         power++;
	     }
		System.out.println(p);
	}
}

Output: 

4
454 55 521 14
11 329 104 989
23447 174 87 845
25 81 53 111
11
40
