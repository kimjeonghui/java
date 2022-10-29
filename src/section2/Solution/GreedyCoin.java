package section2.Solution;

public class GreedyCoin {
    public int partTimeJob(int k) {
        // 오름차순이니까 거꾸로 인덱싱
        int coin = 0;
        int[] divide = new int[]{500, 100, 50, 10, 5, 1};
        for(int i= 0; i<divide.length; i++){
            int quotient = k / divide[i];
            coin += quotient;
            k %= divide[i];
        }
        return coin;
    }
}
