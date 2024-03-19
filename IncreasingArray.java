/***
 * @author Trudy-Lynn O.K. Dube - 202102225, Keletso J. Ditlhotlhole - 202002023, Naomi S. Tumaeletse - 202005404
 * Filename: IncreasingArray.java
 * 
 * Description: 2. Increasing Array from Introductory Problems
 */

import java.util.Scanner;
public class IncreasingArray{

    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a[] = new int[n];
        int moves = 0;

        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }

        for(int i=0; i<n-1; i++){
            while(a[i+1]-a[i] < 0){
                a[i+1] += 1;
                moves += 1;
            }
            i++;
        }
        

        System.out.println(moves);


    }
}