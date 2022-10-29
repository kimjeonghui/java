package daily;

import java.util.HashSet;

public class IsSubsetOf {
    public boolean isSubsetOf(int[] base, int[] sample) {
        HashSet<Integer> b = new HashSet();
        HashSet<Integer> s = new HashSet();

        int lengthS = sample.length;
        int lengthB = base.length;

        for(int i =0; i<lengthS; i++){
                s.add(sample[i]);
        }
        for(int i =0; i<lengthB; i++){
                b.add(base[i]);
        }

        if(b.containsAll(s)) return true;
        else return false;

    }

}


