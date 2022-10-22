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
        
        
        
        /*
        
        
        ublic class Solution { 
  public int numberSearch(String str) {
    // 빈 문자열인 경우 0을 리턴한다.
    if (str.length() == 0) return 0;
        
    // 문자열에서 숫자만 걸러낸다.
    String regexNum = str.replaceAll("[^0-9]", "");
    String regexStr = str.replaceAll("[0-9]", "").replace(" ", "");

    // 전부 더한다. (소수점 나타내기 위해 double형으로 선언)
    double num = 0;

    for(int i = 0; i < regexNum.length(); i++) {
    num += regexNum.charAt(i) - '0';
    }

    // 문자열의 길이로 나눈 값을 반올림하여 리턴한다.
    return (int) Math.round(num / regexStr.length());
  } 
}
        */
    }
}
