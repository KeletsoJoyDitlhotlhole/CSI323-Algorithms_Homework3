/***
 * @author Trudy-Lynn O.K. Dube - 202102225, Keletso J. Ditlhotlhole - 202002023, Naomi S. Tumaeletse - 202005404
 * Filename: StringMatching.java
 * 
 * Description: 8. String Matching from String Algorithms
 */

import java.util.Scanner;

public class StringMatching {

   /***
    * Method to construct a beautiful permutation if such a permutation exists
    * @return
    */

   public static int stringMatching()
   {

     int answer=0;

     Scanner input= new Scanner(System.in);
     String n=input.nextLine();
     String m=input.nextLine();

     if(n.length()==0)
     {
        return 0;
     }

     if(n.length()==1 && m.length()==1)
     {
        if(n.charAt(0)==m.charAt(0))
        {
          return 1;
        }
     }
     else
     { 
      if(m.length()>1)
      {
        for(int i=0; i<n.length()-1;i++)
        {
          if(n.charAt(i)==m.charAt(0) && n.charAt(i+1)==m.charAt(1))
          {
             answer++;
          }
        }
      }
      else
      {
         for(int i=0; i<n.length();i++)
         {
           if(n.charAt(i)==m.charAt(0))
           {
              answer++;
           }
         }
      }
     }
    
     
  return answer;
}

public static void main(String[] args) {
  
   System.out.println(StringMatching.stringMatching());
}

}
