Reverse of array

Input: array
Output: reverse of it

Code:

public class Main
{
	public static void main(String[] args) {
	    int arr[]={1,2,3,4,5};
	    int n=arr.length;
	    int temp=0;
	    for(int i=0;i<=(n-1)/2;i++)
	    {
	        temp=arr[i];
	        arr[i]=arr[n-i-1];
	        arr[n-i-1]=temp;
	    }
	    for(int p:arr)
	    {
	        System.out.println(p);
	    }
	}
}

Output:
5
4
3
2
1
