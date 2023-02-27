Draw the pattern 

Input:
5
  
 Output:

*
**
***
****
*****


Code:

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int j=0;
        for(int i=1;i<=n; )
        {
          if(j<i)
          {
            System.out.print("*");
            j++;
            continue;     
          }
          if(j==i)
          {
            System.out.println("");
            i++;
            j=0;
          }
        }
     }
}
