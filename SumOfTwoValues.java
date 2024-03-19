/***
 * @author Trudy-Lynn O.K. Dube - 202102225, Keletso J. Ditlhotlhole - 202002023, Naomi S. Tumaeletse - 202005404
 * Filename: SumOfTwoValues.java
 * 
 * Description: 5. Sum of two values from Sorting and Searching
 */

import java.util.Scanner;

public class SumOfTwoValues {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();

        int[] a = new int[n+1];

        for(int i=1; i<=n; i++){
            a[i] = scanner.nextInt();
        }

        boolean found = false;
        for(int i=1; i<n; i++){
            if(found == true)
            break;

            for(int j=i+1; j<=n; j++){
                if(a[i] + a[j] == target){
                    System.out.println(i + " " + j);
                    found = true;
                }
            }

        }

        if(found == false)
        System.out.println("IMPOSSIBLE");



    }
    
}
