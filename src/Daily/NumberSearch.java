package Daily;

public class NumberSearch {
    public int numberSearch(String str) {
        //List<Integer> numbers =  new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9)); //왜 참조변수가 List로만 되는지...
        String numbers = "0123456789";
        double answer = 0;
        String[] list = str.split("");
        String pure = "";
        if(str.equals("")) return 0;

        for(int i =0; i<list.length; i++){
            //공백인 경우
            if(list[i].equals(" ")) continue;
            //숫자인 경우
            if(numbers.contains(list[i])){
                answer += Integer.parseInt(list[i]);
                //pure += list[i];
            }
            //숫자가 아닌 문자인 경우
            else{
                pure += list[i];
            }
        }
        double output = answer/pure.length(); // 형변환 https://fors.tistory.com/m/105
        return (int) Math.round((output * 10) / 10); //반올림
    }
}
