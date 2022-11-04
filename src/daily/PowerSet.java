package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PowerSet {
    public ArrayList<String> powerSet(String str) {

        List<String> list = new ArrayList<>();
        list = Arrays.asList(str.split(""));

        //반복제거
        list = list.parallelStream()
                .distinct()
                .collect(Collectors.toList());

        Collections.sort(list);

        int index =0;
        boolean[] in = new boolean[list.size()];
        //결과를 담을 리스트
        ArrayList<String> result = new ArrayList<>();

        result = loop(list, result, index, in);
        Collections.sort(result);

        return result;
    }

    public ArrayList<String> loop(List<String> list, ArrayList<String> result, int index, boolean[] in){
        if(index == list.size()){
            String s= "";
            for(int i=0; i<in.length; i++){

                if(in[i]){
                    s += list.get(i);

                }
            }
            result.add(s);
            return result;
        }
        else{
            in[index] = true;
            loop(list, result, index+1, in);

            in[index] = false;
            loop(list, result, index+1, in);
        }
        return result;
    }
}
