/*create: 2022 05 27
Owner: Nuwan Wijeweera */
/**
 * Question is in JavaLoops2Ques1.jpg & JavaLoops2Ques2.jpg
 */
import java.util.*;

public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int n = scan.nextInt();
        
        for (int i=0; i<n; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            
          
            int sum = a;
            for (int k=0; k<c;k++){
                if (k==c-1){
                    sum += (Math.pow(2,k)*b);
                    System.out.print(sum+" \n");
                }
                else{
                    sum += (Math.pow(2,k)*b);
                    System.out.print(sum+" ");
                }               
            }
        
        scan.close();
            
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }    
}
