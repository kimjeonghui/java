package daily;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RotatedArraySearch {
    public int rotatedArraySearch(int[] rotated, int target) {
        int left = 0;
        int right = rotated.length - 1;

        while(left <= right) {
            int middle = (right + left) / 2;

            if(rotated[middle] == target) {
                return middle;
            }

            if (rotated[left] < rotated[middle]) {
                // 왼쪽 절반이 정렬되어 있는 상태
                if (target < rotated[middle] && rotated[left] <= target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            } else {
                // 오른쪽 절반이 정렬되어 있는 상태
                if (target <= rotated[right] && rotated[middle] < target) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            }
        }

        return -1;
    }
    /*
    내가 푼 이상한 풀이
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

     */
}
