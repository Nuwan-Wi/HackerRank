/*create: 2022 04 05
Owner: Nuwan Wijeweera */
/**You are given an integer n , you have to convert it into a string.
Please complete the partially completed code in the editor. If your code successfully converts n into a string s the code will print "Good job". Otherwise it will print "Wrong answer".
 can range between -100 to 100 inclusive.*/

import java.util.*;

public class JavaInttoString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter the Number: ");
        Integer num1 = scan.nextInt();

        scan.close();
        
        if (num1 >= -100 && num1 <= 100){
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong answer");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
