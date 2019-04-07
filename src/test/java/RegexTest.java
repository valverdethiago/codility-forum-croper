import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

    @Test
    public void basicTest() {
        String regex = "(\\w+)(\\s+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher(" Codility We test coders");
        while(m.find()) {
            System.out.println(String.format("Achamos %d grupos.", m.groupCount()));
            for(int i=0 ; i< m.groupCount(); i++) {
                System.out.println(String.format(" %d grupo: [%s]", i, m.group(i)));
            }
        }
    }

    @Test
    public void spaceTest() {
        String regex = "(\\s+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher m = pattern.matcher("Codility ");
        while(m.find()) {
            System.out.println(String.format("Achamos %d grupos.", m.groupCount()));
            for(int i=0 ; i< m.groupCount(); i++) {
                System.out.println(String.format(" %d grupo: [%s]", i, m.group(i)));
            }
        }
    }
}
