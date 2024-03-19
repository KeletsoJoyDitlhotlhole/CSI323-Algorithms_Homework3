 /***
 * @author Trudy-Lynn O.K. Dube - 202102225, Keletso J. Ditlhotlhole - 202002023, Naomi S. Tumaeletse - 202005404
 * Filename: TreeTraversals.java
 * 
 * Description: 10. Tree Traversals from Additional Problems
 * 
 * References: <Arnab Kundu> <n.d.> <GFG>, <java> <https://www.geeksforgeeks.org/print-postorder-from-given-inorder-and-preorder-traversals/>
 */

import java.util.*;

public class TreeTraversals{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);     
        int n = scanner.nextInt();
        int[] preOrder = new int[n];
        int[] inOrder = new int[n];


        for(int i =0; i<n; i++){
            preOrder[i] = scanner.nextInt();
        }

        for(int i=0; i<n; i++){
            inOrder[i] = scanner.nextInt();
        }

        postOrder(preOrder, inOrder, n);


    }

    public static void postOrder(int[] preOrder, int[] inOrder, int n){
        int rootIndex = findRoot(inOrder, preOrder[0], n);
 
        if(rootIndex != 0){
            postOrder(Arrays.copyOfRange(preOrder, 1, n), inOrder, rootIndex);
        }

        if(rootIndex != n-1){
            postOrder(Arrays.copyOfRange(preOrder, 1+rootIndex, n), Arrays.copyOfRange(inOrder, rootIndex+1, n),  n-rootIndex-1);
        }

        System.out.print(preOrder[0] + " ");
    }

    public static int findRoot(int[]in, int root, int n){
        for(int i=0; i<n; i++){
            if(in[i] == root)
                return i;
        }

            return -1;        
    }
}