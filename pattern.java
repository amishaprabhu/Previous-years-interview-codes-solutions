Print the pattern 

1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
  
Code:

import java.util.*;
class Main {
    public static void main(String[] args) {
        int i, j, a,n; 
  Scanner in= new Scanner(System.in); 
  a= in.nextInt(); 
    n=a; 
  for(i=1;i<=a;i++) 
  { 
   for(j=i;j<=a;j++) 
    { 
    System.out.print(j+" ");   
    } 
   System.out.println(); 
   //a--; 
  } 
            // Fill your code here
        
     }
}

Input: 
5
  Output:

1 2 3 4 5
2 3 4 5
3 4 5
4 5
5
