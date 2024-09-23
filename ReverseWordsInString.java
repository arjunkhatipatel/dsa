import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsInString {
    static String s = "i love programming very much";

    public static void main(String[] args){
        System.out.println("String: " + s);

        System.out.println("Reversed: " + reverseWords());

    }

    public static String reverseWords(){
        String[] arr = s.split(" ");
        Collections.reverse(Arrays.asList(arr));

        return String.join(" ", arr);
    }
}
