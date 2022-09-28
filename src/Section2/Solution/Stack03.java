package Section2.Solution;

import java.util.ArrayList;
import java.util.Stack;

public class Stack03 {

    public ArrayList<Stack> browserStack(String[] actions, String start) {
            Stack<String> prevStack = new Stack<>();
            Stack<String> nextStack = new Stack<>();
            Stack<String> current = new Stack<>();
            ArrayList<Stack> result = new ArrayList<>();

            current.add(start);

            for(int i=0; i<actions.length;i++){
                String data="";
                if(actions[i]=="1" && nextStack.size()!=0){
                    String s = current.get(current.size()-1);
                    current.pop();
                    prevStack.push(s);
                    String n = nextStack.get(nextStack.size()-1);
                    nextStack.pop();
                    current.push(n);
                }
                else if(actions[i] == "-1" && prevStack.size()!=0){
                    String s = current.pop();
                    nextStack.push(s);
                    String n = prevStack.get(prevStack.size()-1);
                    current.push(n);
                    prevStack.pop();
                }else{
                    //비활성화 된 경우 continue;
                    if(actions[i]=="1" || actions[i] == "-1") continue;
                    String s = current.get(current.size()-1);
                    current.pop();
                    prevStack.push(s);
                    current.push(actions[i]);
                    nextStack.clear();
                }
            }
            result.add(prevStack);
            result.add(current);
            result.add(nextStack);
            return result;

    }
}


