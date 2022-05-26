/**Given an integer, N, print its first 10 multiples. Each multiple N*i (where 1<=i<=10) should be printed on a new line in the form: N x i = result.

Input Format

A single integer, N.


Output Format

Print 10 lines of output; each line i (where 1<=i<=10) contains the result of N*i in the form:
N x i = result.

Sample Input

2
Sample Output

2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20*/

import java.util.*;

public class JavaLoops1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for (int i=1; i<=10; i++){
            int mul = N*i;
            System.out.printf("%d x %d = %d%n",N,i,mul);
        }
        
        scan.close();
    }   
}
