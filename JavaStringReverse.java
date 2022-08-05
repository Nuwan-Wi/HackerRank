/*create: 2022 08 03
Owner: Nuwan Wijeweera */
/**
 *A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.

Given a string , A print Yes if it is a palindrome, print No otherwise.

Constraints

A will consist at most 50 lower case english letters.

 Sample Input
madam

Sample Output
Yes
 */

import java.util.*;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Word : ");
        char[] word = scan.next().toCharArray();

        String arr1 = new String(word);
        String arr2 = "";

        for (int i = arr1.length()-1;i>=0;i-- ){
            arr2 = arr2 + word[i];
        }

        if (arr1.equals(arr2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }


        scan.close();
    }
}
