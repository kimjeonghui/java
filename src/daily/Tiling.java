package daily;

import java.util.ArrayList;

public class Tiling {
    public int tiling(int num) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);

        for(int i=3; i<=num; i++){
            int j = list.get(i-1) + list.get(i-2);
            list.add(j);
        }
        return list.get(num);
    }
}
