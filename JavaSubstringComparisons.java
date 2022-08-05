
/**
 We define the following terms:

Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

Function Description

Complete the getSmallestAndLargest function in the editor below.

getSmallestAndLargest has the following parameters:

string s: a string
int k: the length of the substrings to find
Returns

string: the string ' + "\n" + ' where and are the two substrings

Input Format

The first line contains a string denoting s.
The second line contains an integer denoting k.

Constraints

 consists of English alphabetic letters only (i.e., [a-zA-Z]).
Sample Input 0

welcometojava
3
Sample Output 0
ava
wel
 */

import java.util.*;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Word : ");
        String word = scan.next();
        
        System.out.println("Enter the word size :");
        int wordSize = scan.nextInt();
                
        SortedSet<String> sets=new TreeSet<String>();
        
        for(int i=0;i<=word.length()-wordSize;i++){
            sets.add(word.substring(i,i+wordSize));
        }
        
        System.out.println(sets.first());
        System.out.println(sets.last());

        scan.close();
   }
    
}
