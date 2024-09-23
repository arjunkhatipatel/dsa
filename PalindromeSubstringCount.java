public class PalindromeSubstringCount {
    static String s = "abaab";

    public static void main(String[] args){
        System.out.println("String: " + s);

        System.out.println("Palindrome sub strings are: " + countPalindrome());
    }

    private static int countPalindrome() {
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++){
            for (int j = i + 1; j < s.length(); j++){
                if (s.substring(i, j + 1).equalsIgnoreCase(reverseStr(s.substring(i, j + 1)))){
                    count++;
                }
            }
        }

        return  count;
    }

    private static String reverseStr(String substring) {
        String reverse = "";


        for (int i = substring.length() - 1; i >= 0; i--){
            reverse += substring.charAt(i);
        }

        return reverse;
    }
}
