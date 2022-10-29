package daily;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class insertDash {
    public String insertDash(String str) {
        List<Character> list = new ArrayList<>();

        if(str.length()==0) return null;

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i)%2 ==1 && str.charAt(i+1)%2 ==1){
                list.add(str.charAt(i));
                list.add('-');

            }
            else{
                list.add(str.charAt(i));
            }
        }
        //마지막 숫자 더하기
        list.add(str.charAt(str.length()-1));

        return list.stream() //List to String
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
