package daily;
import java.util.Arrays;

public class LSCS {
        public int LSCS(int[] arr) {
            int arrSum = 0;
            int max =Arrays.stream(arr).min().getAsInt();

            for(int i=0; i<arr.length; i++){
                arrSum = arrSum + arr[i];

                if(arrSum > max) max = arrSum;
                if(arrSum <0) arrSum = 0;
            }

            return max;
        }
    }

