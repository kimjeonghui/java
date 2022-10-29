package daily;

public class CompressString {
    public String compressString(String str) {
        String output = "";
        int answer=1;
        for(int i=1; i<str.length(); i++){
            //현재와 이전이 같은 경우
            if(str.charAt(i-1) == str.charAt(i)){
                answer++;
                if(i == str.length()-1){
                    if(answer>=3){
                        output+= String.valueOf(answer)+ String.valueOf(str.charAt(i-1));
                    }
                    else{
                        for(int j =0; j<answer; j++){
                            output += String.valueOf(str.charAt(i-1));
                        }
                    }
                }
            }
            //다른 경우
            else{
                //숫자가 3이상인 경우
                if(answer>=3){
                    output+= String.valueOf(answer)+ String.valueOf(str.charAt(i-1));
                }
                else{
                    for(int j =0; j<answer; j++){
                        output += String.valueOf(str.charAt(i-1));
                    }
                    if(i ==str.length()-1 )output += String.valueOf(str.charAt(i));
                }
                answer =1;

            }
        }
        return output;
    }
}
