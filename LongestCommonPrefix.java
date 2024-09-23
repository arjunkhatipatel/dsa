import java.util.Arrays;

public class LongestCommonPrefix {
    static String[] strs = {"geeksforgeeks", "geeks", "geek", "geezer"};

    public static void main(String[] args) {
        System.out.println("Strings: " + Arrays.toString(strs));

        System.out.println("Longest Common Prefix: " + findPrefix());
    }

    private static String findPrefix() {
        if (strs == null || strs.length == 0)
            return "-1";

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;
        while (i < first.length() && first.charAt(i) == last.charAt(i)){
            i++;
        }

        if(i == 0)
            return "-1";

        return first.substring(0, i);
    }
}
