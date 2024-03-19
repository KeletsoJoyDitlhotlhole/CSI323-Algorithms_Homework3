/***
 * @author Trudy-Lynn O.K. Dube - 202102225, Keletso J. Ditlhotlhole - 202002023, Naomi S. Tumaeletse - 202005404
 * Filename: SumOfThreeValues.java
 * 
 * Description: 7. Sum of Three Values from Sorting and Searching
 */

import java.util.*;
import java.util.Scanner;

public class SumOfThreeValues {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int target = scanner.nextInt();
        int [] a = new int[n+1];

        for(int i=1; i<=n; i++){
            a[i] = scanner.nextInt();
        }

        boolean found = false;

        for(int i=1; i<=n-2; i++){
            if(found == true)
                break;
            for(int j=i+1; j<=n-1; j++){
                if(found == true)
                    break;
                for(int k=j+1; k<=n; k++){
                    if(a[i] + a[j] + a[k] == target){
                        System.out.println(i + " " + j + " " + k);
                        found = true;
                        break;
                    }
                }
            }
        }

        if(found == false){
            System.out.println("IMPOSSIBLE");
        }


    }
    
}
