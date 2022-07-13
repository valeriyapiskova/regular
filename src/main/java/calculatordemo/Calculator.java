import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
    int calculate(String expressionToCalculate) {
        int result = 0;
        final String regex = "[-]*[0-9]+";
        final String string = "fu4uh5ghr890";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        int sum = 0;
        while (matcher.find()) {
            System.out.println("Found number: " + matcher.group(0));
            sum += Integer.parseInt(matcher.group(0));
        }
        System.out.println("sum =" + sum);
        return result;
    }
}

