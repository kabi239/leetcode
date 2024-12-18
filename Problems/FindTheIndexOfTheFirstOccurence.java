public class FindTheIndexOfTheFirstOccurence {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        for (int i = 0; i < h - n + 1; ++i) {
            if (haystack.substring(i, i + n).equals(needle))
                return i;
        }
        return -1;
    }
}
