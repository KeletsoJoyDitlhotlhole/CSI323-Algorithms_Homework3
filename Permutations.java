/***
 * @author Trudy-Lynn O.K. Dube - 202102225, Keletso J. Ditlhotlhole - 202002023, Naomi S. Tumaeletse - 202005404
 * Filename: Permutations.java
 * 
 * Description: 3. Permutations from Introductory Problems
 */

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


public class Permutations {

    public static List<Integer> permutation(int n){
        List<Integer> list = new ArrayList<>();

        if(n ==3){
           list.add(-1);
       }
        // If n is even
        if (n % 2 == 0) {
            for (int i = 2; i <= n; i += 2) {
                 list.add(i);
        }
             for (int i = 1; i < n; i += 2) {
                 list.add(i);
        }
    }
   
      // If n is odd
        else {
            for (int i = 2; i <= n - 1; i += 2) {
                list.add(i);
        }
            for (int j = 1; j <= n; j += 2) {
                list.add(j);
        }
    }
      return list;
}
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        if (n == 1) {
            System.out.println(1);
        } 
        else if (n < 4) {
            System.out.println("NO SOLUTION");
        } 
        else {
            List<Integer> Permutations = permutation(n);

            for (int x : Permutations) {
                System.out.print(x + " ");
            }
        }
    }
}

