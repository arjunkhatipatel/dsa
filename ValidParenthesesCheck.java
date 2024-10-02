import java.util.Stack;

public class ValidParenthesesCheck {
    static String s = "[()]{}{[()()]()}";

    public static void main(String[] args){
        System.out.println("Parannthesis: " + s);

        System.out.println("Valid: " + checkParanthesis());

    }

    private static boolean checkParanthesis() {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) ==  '('){
                stk.push(s.charAt(i));
            }else{
                if (!stk.empty() &&
                    ((s.charAt(i) == ']' && stk.peek() == '[') ||
                    (s.charAt(i) == '}' && stk.peek() == '{') ||
                    (s.charAt(i) == ')' && stk.peek() == '('))){
                    stk.pop();
                }else{
                    return false;
                }
            }
        }
        return stk.empty();
    }
}
