package Section2.Solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class LoadStuff {
    public int movingStuff(int[] stuff, int limit) {
        //정렬
        //배열에서 없애기  -> arrayList

        //collectors와 Collections 차이
        ArrayList<Integer> list = (ArrayList<Integer>) Arrays.stream(stuff).boxed().collect(Collectors.toList());
        Collections.sort(list); //오름차순 정렬

        //박스 개수 세기
        int box = 0;

        // Arrays.sort(list); 배열만 가능

        while(list.size()>1){
            //제한을 넘기는 경우
            if(list.get(0) + list.get(list.size()-1) > limit){
                box++;
                list.remove(list.size()-1); //무거운 요소 삭제

            }else{
                list.remove(list.size()-1); //제일 무거운요소 삭제
                list.remove(0); //제일가벼운 요소 삭제
                box++;
            }
        }
        if(list.size() ==1){
            box++;
        }
        return box;
    }
}
