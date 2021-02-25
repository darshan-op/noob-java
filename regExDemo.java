import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regExDemo {

    public static void main(String[] args) {

        Pattern myPattern = Pattern.compile("[abc]at");
        Matcher matcher = myPattern.matcher("cat");
        boolean isMatching = matcher.matches();
        if (isMatching) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

    }

}
