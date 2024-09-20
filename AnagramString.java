import java.util.Arrays;

public class AnagramString {
    static String one = "Arjun";
    static String two = "arunj";

     public static void main(String[] args) {
         System.out.println(String.format("Str1: %s\nStr2: %s", one, two));

         System.out.println(String.format("Strings are Anagram: %b", findStringAnagram()));

     }

    private static Boolean findStringAnagram() {
         if (one.length() != two.length())
             return false;

         char[] str1 = one.toLowerCase().toCharArray();
         char[] str2 = two.toLowerCase().toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);

         for(int i = 0; i < str1.length; i++){
                 if (str1[i] != str2[i]){
                     return false;
                 }
         }
         return true;
    }
}
