/*create: 2022 05 26
Owner: Nuwan Wijeweera */
/**In this challenge, you must read 3 integers from stdin and then print them to stdout.
 * Each integer must be printed on a new line. To make the problem a little easier, a portion of the
 * code is provided for you in the editor below.
 * There are 3 lines of input, and each line contains a single integer.

Sample Input
42
100
125
Sample Output
42
100
125
 * */

import java.util.*;
public class JavaStdinandStdout1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        scan.close();
        
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    
}
