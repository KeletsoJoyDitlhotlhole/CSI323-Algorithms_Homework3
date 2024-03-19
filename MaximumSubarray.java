/***
 * @author Trudy-Lynn O.K. Dube - 202102225, Keletso J. Ditlhotlhole - 202002023, Naomi S. Tumaeletse - 202005404
 * Filename: MaximumSubarray.java
 * 
 * Description: 6. Maximum subarray Sum from Sorting and Searching
 */

import java.util.Scanner;

public class MaximumSubarray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] a = new int[n];

        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }

        int max=a[0];

         for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum+= a[j];
                if(sum > max){
                    max = sum;
                }
            }
         }

        System.out.println(max);

    }
    
}
