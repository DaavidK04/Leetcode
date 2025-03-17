
import java.util.HashMap;
import java.util.Map;

public class NumberThree_LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        
    }

    public int lengthOfLongestSubstring(String s){
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++){
            char c = s.charAt(right);

            if(map.containsKey(c)){
                left = Math.max(map.get(c) + 1, left);
            }

            map.put(c, right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
