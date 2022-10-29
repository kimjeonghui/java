package stream;

import java.util.Arrays;

public class FindBiggestNumber {
    public Integer findBiggestNumber(int[] arr) {
        if(arr.length == 0) return null;

        Integer answer =  Arrays.stream(arr)
                .max() //Optional 객체 반환
                .getAsInt(); //int 반환, 오토박싱되는듯
        //최대값이 없는 경우, NoSuchElementException 예외 발생

        return answer;
    }
}
