import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesis {

    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            if( ch == '(' || ch =='[' || ch == '{' ){
                stack.push(ch);
            }else{
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();

                if( ch == ')' && top == '(' || ch == '}' && top == '{' || ch == ']' && top == '['  ){
                    stack.pop();
                }else{
                    return false;

                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        
        ValidParenthesis vp = new ValidParenthesis();
        System.out.println(vp.isValid(s));



    }

}