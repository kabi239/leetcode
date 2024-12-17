import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        char[] chararr = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int ans = 0;
        for (int i = 0; i < chararr.length; i++) {
            if (i + 1 < chararr.length && map.get(chararr[i]) < map.get(chararr[i + 1])) {
                ans -= map.get(chararr[i]);
            } else {
                ans += map.get(chararr[i]);
            }
        }
        return ans;
    }
}
