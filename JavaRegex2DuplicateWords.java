import java.util.Scanner;
import java.util.regex.*;

public class JavaRegex2DuplicateWords {
    public static void main(String[] args) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern patrn = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner scan = new Scanner(System.in);

        int Sentences = Integer.parseInt(scan.nextLine());
    
        while (Sentences-- > 0) {
            String word = scan.nextLine();
    
            Matcher nextWord = patrn.matcher(word);
    
            while (nextWord.find()) {
                word = word.replaceAll(nextWord.group(),nextWord.group(1));
            }

            System.out.println(word);
        }
    
        scan.close();
    }
    
}
