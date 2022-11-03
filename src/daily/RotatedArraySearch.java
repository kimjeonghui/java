package daily;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RotatedArraySearch {
    public int rotatedArraySearch(int[] rotated, int target) {

        int max = Arrays.stream(rotated).max().getAsInt();
        if(target <= max){
            return Arrays.stream(rotated)                     // IntStream
                    .boxed()                        // Stream<Integer>
                    .collect(Collectors.toList())   // List<Integer>
                    .indexOf(target);


        }
        return -1;
    }
}
