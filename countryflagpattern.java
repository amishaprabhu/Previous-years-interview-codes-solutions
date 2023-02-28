Flag Pattern - ITALY
 
Write a program to generate the Italy country flag pattern. In Italy flag, 
Green color should be represented by “(” symbol. 
White color should be represented by “#” symbol.
Red color should be represented by “)” symbol.
 
 
Input and Output Format:
 
Input consists of a single integer, n. Assume that “n>=4” and should be an even number.
The width to length ratio of the flag is 2:3.
Refer sample input and output for formatting specifications.
 
Sample Input 1:
 
4
 
Sample Output 1:
 
( ( # # ) ) 
( ( # # ) ) 
( ( # # ) ) 
( ( # # ) ) 
 


Code:

import java.util.*;
class Main {
    public static void main(String[] args) {
        int i, j, a,n; 
  Scanner in= new Scanner(System.in); 
  a= in.nextInt(); 
  for(i=1;i<=a;i++) 
  { 
   for(j=1;j<=a/2;j++) 
    { 
    System.out.print("( ");   
    } 
    for(int k=1;k<=a/2;k++)
    {
        System.out.print("# ");
    }
    for(int l=1;l<=a/2;l++)
    {
        System.out.print(") ");
    }
   System.out.println(); 
 } 
            // Fill your code here
        
     }
}

Input:
18
  
  Output:

( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) ) 
( ( ( ( ( ( ( ( ( # # # # # # # # # ) ) ) ) ) ) ) ) )
