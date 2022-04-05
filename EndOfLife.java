/*create: 2022 04 05
Owner: Nuwan Wijeweera */

/**"In computing, End Of File (commonly abbreviated EOF) is a condition in a computer operating system where no more data can be read from a data source." — (Wikipedia: End-of-file)

The challenge here is to read  lines of input until you reach EOF, then number and print all  lines of content.

Hint: Java's Scanner.hasNext() method is helpful for this problem.

Input Format

Read some unknown  lines of input from stdin(System.in) until you reach EOF; each line of input contains a non-empty String.

Output Format

For each line, print the line number, followed by a single space, and then the line content received as input.
 */
import java.util.*;

public class EndOfLife {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = 1;        
        
        while (input.hasNextLine()){
            String line = input.nextLine();
            
            System.out.println(i + " " + line);
            i++;
        }
        input.close();
    }

}
