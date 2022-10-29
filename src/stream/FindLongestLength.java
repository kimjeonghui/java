package stream;

import java.util.Arrays;

public class FindLongestLength {
    public int findLongestLength(String[] strArr) {
        if(strArr.length == 0) return 0;
        int answer = Arrays.stream(strArr)
                .mapToInt(i -> i.length())
                .max()
                .getAsInt();

        return answer;
    }
}
