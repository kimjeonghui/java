package Section2.Solution;

import java.util.ArrayList;

public class Pi_rockPaperScissors {

    String[] list = new String[]{"rock","paper","scissors"};

    public ArrayList<String[]> rockPaperScissors(int rounds) {
        //서로 다른 3개 중 rounds개 를 선택

        ArrayList<String[]> big = new ArrayList<String[]>(); //큰 어레이


        while(big.size()<Math.pow(3,rounds)){
            ArrayList<String> small = new ArrayList<String>(); //작은 어레이
            dfs(big,small,0,rounds);
        }
        return big;

    }
    public void dfs(ArrayList<String[]> big, ArrayList<String> small, int depth,int rounds){
        //깊이가 마지막인 경우:탈출 조건
        if(depth==rounds){
            //어레이리스트를 리스트로 반환
            String[] s= small.stream().toArray(String[]::new);
            big.add(s);
        }
        //그렇지 않을 때
        else{
            for(int i=0; i<3; i++){
                small.add(list[i]);
                dfs(big,small,depth+1,rounds);
            }
        }

    }

}
