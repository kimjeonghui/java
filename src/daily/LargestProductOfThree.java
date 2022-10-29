package daily;

import java.util.Arrays;

public class LargestProductOfThree {
    public int largestProductOfThree(int[] arr) {

        Arrays.sort(arr);
        int arrLength = arr.length;
        //가장 큰 양수 3가지를 곱한 값
        int candidate1 = arr[arrLength - 1] * arr[arrLength - 2] * arr[arrLength - 3];
        //가장 작은 음수 2가지와, 가장 큰 양수를 곱한 값
        int candidate2 = arr[arrLength - 1] * arr[0] * arr[1];
        return Math.max(candidate1, candidate2);

        /*
        ////////////내가 푼 코드////////////

        int answer =1;

        //요소가 3개일 때
        if(arr.length == 3) return arr[0] * arr[1] * arr[2];

        //음수 양수 따로 저장
        ArrayList<Integer> plus = new ArrayList<>();
        ArrayList<Integer> minor = new ArrayList<>();
        int[] zero = new int[1];

        //플마 나누고 크기순으로 정렬
        for(int i =0; i<arr.length; i++){
            if(arr[i] ==0 ){
                zero[0] =0;
                continue;
            }
            else if(arr[i]>0){
                plus.add(arr[i]);
                continue;
            }
            else{
                minor.add(arr[i]);
                continue;
            }
        }
        Collections.sort(plus, Collections.reverseOrder());
        Collections.sort(minor, Collections.reverseOrder());

        //4개 이상인데 음수의 개수가 1 이하인 경우=> 양수 제일 큰 거 세개
        //4개 이상인데 양수의 개수가 없는 경우
        //0이 포함된 경우 =>음*음*영
        //영이 포함되지 않은 경우 음수 제일 작은 거 3개
        //4개 이상이라면 음수/양수에서 두개씩 곱한 값의 대소관계 비교
        //나머지는 무조건 양수에서 골라야함
        //양수의 곱이 선택됐을 때
        //음수의 곱이 선택됐을 때
        if(minor.size() <2 ){
            answer = plus.get(0) *plus.get(1)* plus.get(2);
        }
        else if(plus.size() == 0){
            answer = minor.get(0)*minor.get(1)*minor.get(2);
        }
        else if(plus.size() <3 && plus.size() >0){
            answer = minor.get(minor.size()-1)*minor.get(minor.size()-2)* plus.get(0);
        }
        else{
            if(plus.get(0)*plus.get(1) > minor.get(0)*minor.get(1)){
                answer = plus.get(0) *plus.get(1)* plus.get(2);
            }
            else{
                answer = minor.get(0)*minor.get(1)* plus.get(0);
            }
        }
        return answer;

        */
    }
}
