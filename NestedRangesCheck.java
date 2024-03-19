/***
 * @author Trudy-Lynn O.K. Dube - 202102225, Keletso J. Ditlhotlhole - 202002023, Naomi S. Tumaeletse - 202005404
 * Filename: NestedRangesCheck.java
 * 
 * Description: 9. Nested Ranges Check from Sorting and Searching
 * 
 * References: <Abdullah Aslam> <n.d.> <GFG>, <java> <https://www.geeksforgeeks.org/find-a-range-that-covers-all-the-elements-of-given-n-ranges/>
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Range{
    int start, end;

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class NestedRangesCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        List<Range> range = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();

            range.add(new Range(x, y));
        }

        int[] cntain = new int[n];
        int[] containedBy = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (range.get(j).start >= range.get(i).start && range.get(j).end <= range.get(i).end) {
                        cntain[i] = 1;
                    } else if (range.get(i).start >= range.get(j).start && range.get(i).end <= range.get(j).end) {
                        containedBy[i] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(cntain[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.print(containedBy[i] + " ");
        }
    }
}
