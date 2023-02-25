Printitng table of 2 to 6 in a 2D matrix.

  Input: 2D array
  Output: Table of 2 to 6
    
    
Code:

public class Main
{
	public static void main(String[] args) {
		int arr[][]=new int[5][10];
		int p=2;
		for(int i=0;i<5;i++)
		{
		    for(int j=0;j<10;j++)
		    {
		        arr[i][j]=p*(j+1);
		        System.out.print(arr[i][j]+" ");
		    }
		    p++;
		    System.out.println("");
		}
	}
}


Output:

2 4 6 8 10 12 14 16 18 20 
3 6 9 12 15 18 21 24 27 30 
4 8 12 16 20 24 28 32 36 40 
5 10 15 20 25 30 35 40 45 50 
6 12 18 24 30 36 42 48 54 60 
  
  
