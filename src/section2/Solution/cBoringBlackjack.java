package section2.Solution;

import java.util.ArrayList;

public class cBoringBlackjack {
    ArrayList<Integer> combi=  new ArrayList<>();
    int cnt =0;
    int sum=0;
    public int boringBlackjack(int[] cards) {
        //int n= factorialUsingForLoop(cards.length)/(6 * factorialUsingForLoop(cards.length-3));
        //r의 숫자가 정해진 조합 nCr


        for(int i=0; i<cards.length; i++){
            for(int j = i+1; j<cards.length; j++){
                for(int k= j+1; k<cards.length; k++){
                    int sum = cards[i]+cards[j]+ cards[k];
                    if(isPrime(sum))cnt++;
                }
            }
        }

        return cnt;

    }



    public static boolean isPrime(int num){
        for(int i=2; i*i<=num; i++){
            if(num % i == 0) return false;
        }
        return true;
    }

    public int factorialUsingForLoop(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
