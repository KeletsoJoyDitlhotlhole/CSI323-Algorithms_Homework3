/***
 * @author Trudy-Lynn O.K. Dube - 202102225, Keletso J. Ditlhotlhole - 202002023, Naomi S. Tumaeletse - 202005404
 * Filename: MissingNum.java
 * 
 * Description: 1. Missing Number from Introductory Problems
 */

import java.util.Scanner;


public class MissingNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n - 1; i++) {
            arr[i] = input.nextInt();
        }

        // Find the missing number
        int missingNumber = missing(arr, n);
        System.out.println(missingNumber);
    }
    

    /***
     * Method called missing to return the missing number from a range of values
     * 
     * @param arr-array to store the values
     * @param N- the number of values to store
     * @return the missing number
     */
    public static int missing(int arr[], int N) {
        int n[] = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = 0;
        }

        for (int i = 0; i < N - 1; i++) {
            n[arr[i] - 1] = 1;
        }

        int ans = 0;
        for (int i = 0; i < N; i++) {
            if (n[i] == 0) {
                ans = i + 1;
                break;
            }
        }
        return ans;
    }
}
