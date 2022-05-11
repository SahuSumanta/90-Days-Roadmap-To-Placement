package Others;

import java.util.Stack;

public class BackspaceComapre {

    public static boolean backspaceCompare(String s, String t) {

        return reForm(s).equals(reForm(t));

        
    }

    public static String reForm(String s){
        char[] sChar = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < sChar.length; i++) {
            if (sChar[i] == '#' && !stack.isEmpty()){
                stack.pop();
            }

            if(sChar[i] != '#'){
                stack.push(sChar[i]);
            }
        }

        return String.valueOf(stack);
    }
    public static void main(String[] args) {

        String s = "ab#c";
        String t = "ad#c";

        System.out.println(backspaceCompare(s, t));
        
    }
}
