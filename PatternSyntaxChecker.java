/*create: 2022 08 05
Owner: Nuwan Wijeweera */
/**
 Using Regex, we can easily match or search for patterns in a text. Before searching for a pattern, we have to specify one using some well-defined syntax.

In this problem, you are given a pattern. You have to check whether the syntax of the given pattern is valid.

Note: In this problem, a regex is only valid if you can compile it using the Pattern.compile method.

Input Format

The first line of input contains an integer N, denoting the number of test cases. The next N lines contain a string of any printable characters representing the pattern of a regex.

Output Format
For each test case, print Valid if the syntax of the given pattern is correct. Otherwise, print Invalid. Do not print the quotes.

Sample Input
3
([A-Z])(.+)
[AZ[a-z](a-z)
batcatpat(nat

Sample Output
Valid
Invalid
Invalid
 */

import java.util.*;
import java.util.regex.*;

public class PatternSyntaxChecker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of test cases: ");
        int tests = Integer.parseInt(scan.nextLine());

        while(tests > 0){
            String pattern = scan.nextLine();

            try {
                Pattern.compile(pattern);
                System.out.println("Valid");
            } 
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }

            tests--;
        }

        scan.close();
    }
}
