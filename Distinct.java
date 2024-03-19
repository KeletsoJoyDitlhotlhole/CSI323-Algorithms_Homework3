/***
 * @author Trudy-Lynn O.K. Dube - 202102225, Keletso J. Ditlhotlhole - 202002023, Naomi S. Tumaeletse - 202005404
 * Filename: Distinct.java
 * 
 * Description: 4. Distinct Number from Sorting and Searching
 */

import java.util.Scanner;
import java.util.Arrays;

public class Distinct
{

     /***
      * Method to find the number of distinct numbers
      *
      * @return number of distinct numbers
      */
  public static int distinct() {

    Scanner input=new Scanner(System.in);
    int n=input.nextInt();

         
    int[] arr=new int[n];

    //read values
    int j=0;
    int upperBound1=2*10^5;

    if(n>=2 && n<=upperBound1){
       while(j<n)
         {
            arr[j] =input.nextInt();
            j++;
         }
    } 

    Arrays.sort(arr);

    int m=0;

    for(int i=0;i<n;i++)
    { 
      int bound=i+1;
      if(bound != n)
      {

       if(arr[i] != arr[i+1] )
        {
            m++;
        }
      }
    }
    
    return m+1;

  }

  public static void main(String[] args) {
      
    System.out.println(Distinct.distinct());
  }
  
}