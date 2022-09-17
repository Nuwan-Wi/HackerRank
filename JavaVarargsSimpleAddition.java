/*create: 2022 09 17
Owner: Nuwan Wijeweera */
/**You are given a class Solution and its main method in the editor.
Your task is to create the class Add and the required methods so that the code prints the sum of the numbers passed to the function add.

Note: Your add method in the Add class must print the sum as given in the Sample Output

Input Format

There are six lines of input, each containing an integer.

Output Format

There will be only four lines of output. Each line contains the sum of the integers passed as the parameters to add in the main method.

Sample Input
1
2
3
4
5
6

Sample Output
1+2=3
1+2+3=6
1+2+3+4+5=15
1+2+3+4+5+6=21 */

import java.util.Scanner;

public class JavaVarargsSimpleAddition {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int num4 = scan.nextInt();
        int num5 = scan.nextInt();
        int num6 = scan.nextInt();

        System.out.printf("%d+%d=%d\n", num1, num2, num1+num2);
        System.out.printf("%d+%d+%d=%d\n", num1, num2, num3, num1+num2+num3);
        System.out.printf("%d+%d+%d+%d+%d=%d\n", num1, num2, num3, num4, num5, num1+num2+num3+num4+num5);
        System.out.printf("%d+%d+%d+%d+%d+%d=%d\n", num1, num2, num3, num4, num5, num6, num1+num2+num3+num4+num5+num6);

        scan.close();
    }
    
}
