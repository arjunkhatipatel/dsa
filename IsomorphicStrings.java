import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    static String str1 = "abca";
    static String str2 = "zbxz";

    public static void main(String[] args){
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        System.out.println("Strings are Isomorphic: " + checkIsomorphic());
    }

    private static boolean checkIsomorphic() {
        if(str1.length() != str2.length())
            return false;

        Boolean result = false;

        Map<Character, Character> stringMap = new HashMap<>();

        for (int i = 0; i < str1.length(); i++){
            if (stringMap.containsKey(str1.charAt(i))){
                if (stringMap.get(str1.charAt(i)).equals(str2.charAt(i))){
                    result = true;
                }else{
                    return false;
                }
            }else{
                stringMap.put(str1.charAt(i), str2.charAt(i));
            }
        }

        return result;
    }
}
