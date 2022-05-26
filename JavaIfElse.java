/*create: 2022 05 26
Owner: Nuwan Wijeweera */
/**Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

Input Format

A single line containing a positive integer, n.

Output Format

Print Weird if the number is weird; otherwise, print Not Weird.

Sample Input 0

3
Sample Output 0

Weird
Sample Input 1

24
Sample Output 1

Not Weird
*/

import java.util.*;

public class JavaIfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = scan.nextInt();
        scan.close();
        
        if (num % 2 == 0){
            if (num>=2 && num<5){
                System.out.println("Not Weird");
            }
            if (num>=6 && num <=20){
                System.out.println("Weird");
            }
            else{
                System.out.println("Not Weird");
            }
        }
        else{
            System.out.println("Weird");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }  
}
