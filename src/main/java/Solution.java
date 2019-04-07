import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {


    public String solution(String message, int K) {
        if(message == null || message.trim().isEmpty()) {
            return "";
        }
        if(message.length() <= K) {
            return message;
        }
        StringBuilder sb = new StringBuilder();
        Map<String, String> words = this.splitMessage(message);
        for(String key : words.keySet()) {
            if(sb.length() + key.length() > K) {
                break;
            }
            sb.append(words.get(key));
        }
        return sb.toString().trim();
    }

    public Map<String, String> splitMessage(String message) {
        String regex = "(\\w+)(\\s+)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(message);
        Map<String, String> tuples = new LinkedHashMap<>();

        while(matcher.find())
            tuples.put(matcher.group(1), matcher.group(0));
        return tuples;

    }
}
