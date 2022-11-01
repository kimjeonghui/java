package daily;

import java.util.HashMap;
import java.util.Stack;

public class BalancedBrackets {
    public boolean balancedBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        HashMap<Character, Character> opener = new HashMap<>();
        opener.put('{', '}');
        opener.put('[', ']');
        opener.put('(', ')');

        String closer = "}])";

        for(int i =0; i < str.length(); i++){
            if(opener.containsKey(str.charAt(i))){
                stack.push(str.charAt(i));
            }
            else if(closer.indexOf(str.charAt(i))!= -1 && stack.size() > 0){
                char top = stack.pop();
                char pair = opener.get(top);
                if(pair != str.charAt(i)){
                    return false;
                }
            }
            else{
                return false;
            }
        }

        return stack.size() == 0;

        /*
        Stack<String> stack = new Stack<>();
        for(int i=0; i<str.length(); i++){
            String s = Character.toString(str.charAt(i));
            if(s.equals("(") ||s.equals("{") || s.equals("[")){
                stack.add(s);
            }
            else if(s.equals(")") || s.equals("}") || s.equals("]")){
                if(stack.size() ==0) return false;
                String p = stack.pop();
                if(s.equals(")")){
                    if(p.equals("(")) continue;
                    else return false;
                }
                else if(s.equals("}")){
                    if(p.equals("{")) continue;
                    else return false;
                }
                else{
                    if(p.equals("[")) continue;
                    else return false;
                }

            }
            else continue;

        }

        if(stack.size() ==0 ) return true;
        else return false;
        */

    }
}
