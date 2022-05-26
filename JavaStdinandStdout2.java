/*create: 2022 05 26
Owner: Nuwan Wijeweera */
/**In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.

Note: We recommend completing Java Stdin and Stdout I before attempting this challenge.

Input Format

There are three lines of input:

The first line contains an integer.
The second line contains a double.
The third line contains a String.
Output Format

There are three lines of output:

On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.
To make the problem easier, a portion of the code is already provided in the editor.

Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; because of this, the last newline character for that line of integer input is still queued in the input buffer and the next nextLine() will be reading the remainder of the integer line (which is empty).

Sample Input

42
3.1415
Welcome to HackerRank's Java tutorials!
Sample Output

String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42*/

import java.util.*;

public class JavaStdinandStdout2 {
    /**
     * this is a semple question. but is has a greate lesson.
     * if i take string line input first and then int input there is no problem.
     * but if the way around it didn't work.
     * because of the after every input there shoud be and /n. in nextline scanner identify this as next line. so is memorize empty line.
     * to avoid this we need to add unnecessory nextLine to the code. then it will work properly.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        double num2;
        String text;
        
        num1 = scan.nextInt();
        num2 = scan.nextDouble();
        scan.nextLine();
        text = scan.nextLine();
        scan.close();
        
        
        System.out.println("String: "+text);
        System.out.println("Double: "+ num2);
        System.out.println("Int: "+ num1);        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }    
}
