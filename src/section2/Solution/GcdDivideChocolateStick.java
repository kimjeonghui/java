package section2.Solution;

import java.util.ArrayList;

public class GcdDivideChocolateStick {
    public ArrayList<Integer[]> divideChocolateStick(int M, int N) {
        //공약수
        //최대 M까지만 확인하면 됨
        ArrayList<Integer[]> out= new ArrayList<>();

        for(int i=1; i<=M; i++){
            if(M%i==0 && N%i==0){
                Integer[] list = new Integer[]{i, M/i, N/i};
                out.add(list);
            }
        }
        return out;

    }
}
