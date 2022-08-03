/*create: 2022 08 03
Owner: Nuwan Wijeweera */
/**Given a string, s, and two indices, strat and end, print a substring consisting of all characters in the inclusive range from start to end-1. You'll find the String class' substring method helpful in completing this challenge.

Input Format

The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of Start and End.

Output Format

Print the substring in the inclusive range from start to end-1.

Sample Input

Helloworld
3 7
Sample Output
lowo
 */
import java.util.*;

public class JavaSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Word : ");
        char[] arr =  scan.next().toCharArray();
        System.out.println(arr);

        System.out.println("Enter the first and last number :");
        int flatter = scan.nextInt();
        int llatter = scan.nextInt();

        for (int i = flatter; i < llatter; i++){
            System.out.print(arr[i]);
        }
        

        scan.close();
    }
}