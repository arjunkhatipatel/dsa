import java.util.HashMap;
import java.util.LinkedHashMap;

public class DecimalToRoman {



    public static void main(String[] args) {
    LinkedHashMap<Integer, String> dict = new LinkedHashMap<>();
        dict.put(1000, "M");
        dict.put(900, "CM");
        dict.put(500, "D");
        dict.put(400, "CD");
        dict.put(100, "C");
        dict.put(90, "XC");
        dict.put(50, "L");
        dict.put(40, "XL");
        dict.put(10, "X");
        dict.put(9, "IX");
        dict.put(5, "V");
        dict.put(4, "IV");
        dict.put(1, "I");

        int target = 3549;

        System.out.println("Decimal: " + target);
        System.out.println("Roman: " + convertDecimalToRoman(dict, target));
    }

    private static String convertDecimalToRoman(LinkedHashMap<Integer, String> dict, int target){
        if(target == 0){
            return "";
        }
        StringBuilder result = new StringBuilder();

        for (Integer key : dict.keySet()){
            while (target >= key){
                result.append(dict.get(key));
                target -= key;
            }
        }

        return result.toString();
   }
}
