package daily;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveExtremes {
    public String[] removeExtremes(String[] arr) {
        int maxIndex = 0;
        int minIndex =0;
        List<String> output = new ArrayList<>(); //다형성에 대해서 생각해보기, List와 ArrayList, 참조타입과 참조변수
        output = new ArrayList<>(Arrays.asList(arr)); //java.lang.UnsupportedOperationException.
        //Arrays.asList()로 생성한 배열은 변경 불가능이라서 캐스팅해야됨

        if(arr.length == 0) return null;
        for(int i=1; i<arr.length; i++){ //큰값제거
            if(arr[i].length() >= arr[maxIndex].length()){
                maxIndex = i;
            }
        }

        output.remove(maxIndex);

        for(int i=1; i<output.size(); i++){ //작은 값 찾기
            if(output.get(i).length()<= output.get(minIndex).length()){
                minIndex = i;
            }
        }
        output.remove(minIndex);


        return output.stream().toArray(String[]::new); // 함수에 대해서 알아보기

    }
}
